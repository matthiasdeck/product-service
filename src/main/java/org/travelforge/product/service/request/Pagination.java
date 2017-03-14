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

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Matthias Deck
 */
public class Pagination implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer offset;
    private Integer limit;
    private String[] sorting;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String[] getSorting() {
        return sorting;
    }

    public void setSorting(String[] sorting) {
        this.sorting = sorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pagination that = (Pagination) o;

        if (offset != null ? !offset.equals(that.offset) : that.offset != null) return false;
        if (limit != null ? !limit.equals(that.limit) : that.limit != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(sorting, that.sorting);
    }

    @Override
    public int hashCode() {
        int result = offset != null ? offset.hashCode() : 0;
        result = 31 * result + (limit != null ? limit.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(sorting);
        return result;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "page=" + offset +
                ", size=" + limit +
                ", sorting=" + Arrays.toString(sorting) +
                '}';
    }
}
