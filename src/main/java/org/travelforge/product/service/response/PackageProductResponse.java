/*
* The Travelforge Project
* http://www.travelforge.org
*
* Copyright (c) 2015 - 2017 Matthias Deck
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to
* deal in the Software without restriction, including without limitation the
* rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
* sell copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*
*/
package org.travelforge.product.service.response;

import org.travelforge.product.model.PackageProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Matthias Deck
 */
public final class PackageProductResponse extends PackageResponse {

    private static final long serialVersionUID = 1L;

    private final PageInfo pageInfo;
    private final List<PackageProduct> products;

    private PackageProductResponse(ResponseContext context, PageInfo pageInfo, List<PackageProduct> products) {
        super(context);
        this.pageInfo = pageInfo;
        this.products = products;
    }

    public static Builder builder() {
        return new Builder();
    }

    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public List<PackageProduct> getProducts() {
        return this.products;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: check if equals works
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PackageProductResponse response = (PackageProductResponse) o;

        if (pageInfo != null ? !pageInfo.equals(response.pageInfo) : response.pageInfo != null) return false;
        return products != null ? products.equals(response.products) : response.products == null;
    }

    @Override
    public int hashCode() {
        // TODO: check if hashcode works
        int result = super.hashCode();
        result = 31 * result + (pageInfo != null ? pageInfo.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        // TODO: beautify toString output
        return "PackageProductResponse{" +
                "pageInfo=" + pageInfo +
                ", products=" + products +
                "} " + super.toString();
    }

    public static final class Builder extends PackageResponse.Builder<PackageProductResponse> {

        private ResponseContext context;
        private PageInfo pageInfo;
        private List<PackageProduct> products;

        private Builder() {
            super();
        }

        public Builder context(ResponseContext context) {
            this.context = context;
            return this;
        }

        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder product(PackageProduct product) {
            if (this.products == null) {
                this.products = new ArrayList<>();
            }
            this.products.add(product);
            return this;
        }

        public Builder products(List<PackageProduct> products) {
            if (this.products == null) {
                this.products = new ArrayList<>();
            }
            this.products.addAll(products);
            return this;
        }

        public Builder clearProducts() {
            if (this.products != null)
                this.products.clear();
            return this;
        }

        public PackageProductResponse build() {
            List<PackageProduct> products = null;
            if (this.products != null && !this.products.isEmpty()) {
                products = Collections.unmodifiableList(new ArrayList<>(this.products));
            }
            return new PackageProductResponse(context, pageInfo, products);
        }
    }
}
