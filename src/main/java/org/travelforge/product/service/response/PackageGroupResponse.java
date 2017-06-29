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

import org.travelforge.product.model.PackageProductGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Matthias Deck
 */
public final class PackageGroupResponse extends PackageResponse {

    private static final long serialVersionUID = 1L;

    private final List<PackageProductGroup> productGroups;

    private PackageGroupResponse(ResponseContext context, List<PackageProductGroup> productGroups) {
        super(context);
        this.productGroups = productGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<PackageProductGroup> getProductGroups() {
        return this.productGroups;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: check if equals works
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PackageGroupResponse response = (PackageGroupResponse) o;

        return productGroups != null ? productGroups.equals(response.productGroups) : response.productGroups == null;
    }

    @Override
    public int hashCode() {
        // TODO: check if hashcode works
        int result = super.hashCode();
        result = 31 * result + (productGroups != null ? productGroups.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        // TODO: beautify toString output
        return "PackageGroupResponse{" +
                "productGroups=" + productGroups +
                "} " + super.toString();
    }

    public static final class Builder extends PackageResponse.Builder<PackageGroupResponse> {

        private ResponseContext context;
        private List<PackageProductGroup> productGroups;

        private Builder() {
            super();
        }

        public Builder context(ResponseContext context) {
            this.context = context;
            return this;
        }

        public Builder productGroup(PackageProductGroup productGroup) {
            if (this.productGroups == null) {
                this.productGroups = new ArrayList<>();
            }
            this.productGroups.add(productGroup);
            return this;
        }

        public Builder productGroups(List<PackageProductGroup> productGroups) {
            if (this.productGroups == null) {
                this.productGroups = new ArrayList<>();
            }
            this.productGroups.addAll(productGroups);
            return this;
        }

        public Builder clearProductGroups() {
            if (this.productGroups != null)
                this.productGroups.clear();
            return this;
        }

        public PackageGroupResponse build() {
            List<PackageProductGroup> productGroups = null;
            if (this.productGroups != null && !this.productGroups.isEmpty()) {
                productGroups = Collections.unmodifiableList(new ArrayList<>(this.productGroups));
            }
            return new PackageGroupResponse(context, productGroups);
        }
    }
}
