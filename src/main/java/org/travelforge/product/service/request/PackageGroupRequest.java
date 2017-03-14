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

import org.travelforge.product.search.model.PackageProductFilter;

/**
 * @author Matthias Deck
 */
public class PackageGroupRequest implements PackageRequest {

    private static final long serialVersionUID = 1L;

    private RequestHeaders headers;
    private RequestOptions options;
    private PackageProductFilter filter;


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

    public PackageProductFilter getFilter() {
        return filter;
    }

    public void setFilter(PackageProductFilter filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageGroupRequest that = (PackageGroupRequest) o;

        if (headers != null ? !headers.equals(that.headers) : that.headers != null) return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        return filter != null ? filter.equals(that.filter) : that.filter == null;
    }

    @Override
    public int hashCode() {
        int result = headers != null ? headers.hashCode() : 0;
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (filter != null ? filter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageGroupRequest{" +
                "headers=" + headers +
                ", options=" + options +
                ", filter=" + filter +
                '}';
    }
}
