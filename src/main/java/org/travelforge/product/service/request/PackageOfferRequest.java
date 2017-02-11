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
package org.travelforge.product.service.request;

import org.travelforge.product.search.model.PackageProductQuery;

/**
 * @author Matthias Deck
 */
public class PackageOfferRequest implements PackageRequest, Pageable {

    private static final long serialVersionUID = 1L;

    private RequestHeaders headers;
    private RequestOptions options;
    private PackageProductQuery query;
    private Pagination pagination;

    @Override
    public RequestHeaders getHeaders() {
        return headers;
    }

    @Override
    public void setHeaders(RequestHeaders headers) {
        this.headers = headers;
    }

    @Override
    public RequestOptions getOptions() {
        return options;
    }

    @Override
    public void setOptions(RequestOptions options) {
        this.options = options;
    }

    @Override
    public PackageProductQuery getQuery() {
        return query;
    }

    @Override
    public void setQuery(PackageProductQuery query) {
        this.query = query;
    }

    @Override
    public Pagination getPagination() {
        return pagination;
    }

    @Override
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackageOfferRequest)) return false;

        PackageOfferRequest that = (PackageOfferRequest) o;

        if (headers != null ? !headers.equals(that.headers) : that.headers != null) return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        return pagination != null ? pagination.equals(that.pagination) : that.pagination == null;
    }

    @Override
    public int hashCode() {
        int result = headers != null ? headers.hashCode() : 0;
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (query != null ? query.hashCode() : 0);
        result = 31 * result + (pagination != null ? pagination.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageOfferRequest{" +
                "headers=" + headers +
                ", options=" + options +
                ", query=" + query +
                ", pagination=" + pagination +
                '}';
    }
}
