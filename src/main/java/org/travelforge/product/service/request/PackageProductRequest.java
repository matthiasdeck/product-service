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

import org.travelforge.product.search.model.PackageProductRequestParameters;

/**
 * @author Matthias Deck
 */
public class PackageProductRequest implements PackageRequest, Pageable {

    private static final long serialVersionUID = 1L;

    private RequestContext context;
    private RequestOptions options;
    private PackageProductRequestParameters parameters;
    private Pagination pagination;

    @Override
    public RequestContext getContext() {
        return context;
    }

    @Override
    public void setContext(RequestContext context) {
        this.context = context;
    }

    @Override
    public RequestOptions getOptions() {
        return options;
    }

    @Override
    public void setOptions(RequestOptions options) {
        this.options = options;
    }

    public PackageProductRequestParameters getParameters() {
        return parameters;
    }

    public void setParameters(PackageProductRequestParameters parameters) {
        this.parameters = parameters;
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
        if (o == null || getClass() != o.getClass()) return false;

        PackageProductRequest that = (PackageProductRequest) o;

        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        if (parameters != null ? !parameters.equals(that.parameters) : that.parameters != null) return false;
        return pagination != null ? pagination.equals(that.pagination) : that.pagination == null;
    }

    @Override
    public int hashCode() {
        int result = context != null ? context.hashCode() : 0;
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
        result = 31 * result + (pagination != null ? pagination.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageProductRequest{" +
                "context=" + context +
                ", options=" + options +
                ", parameters=" + parameters +
                ", pagination=" + pagination +
                '}';
    }
}
