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

import java.io.Serializable;

/**
 * @author Matthias Deck
 */
public final class PageInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer resultsFrom;
    private final Integer resultsPerPage;
    private final Integer resultsTotal;

    private PageInfo(Integer resultsFrom, Integer resultsPerPage, Integer resultsTotal) {
        this.resultsFrom = resultsFrom;
        this.resultsPerPage = resultsPerPage;
        this.resultsTotal = resultsTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getResultsFrom() {
        return this.resultsFrom;
    }

    public Integer getResultsPerPage() {
        return this.resultsPerPage;
    }

    public Integer getResultsTotal() {
        return this.resultsTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PageInfo pageInfo = (PageInfo) o;

        if (resultsFrom != null ? !resultsFrom.equals(pageInfo.resultsFrom) : pageInfo.resultsFrom != null)
            return false;
        if (resultsPerPage != null ? !resultsPerPage.equals(pageInfo.resultsPerPage) : pageInfo.resultsPerPage != null)
            return false;
        return resultsTotal != null ? resultsTotal.equals(pageInfo.resultsTotal) : pageInfo.resultsTotal == null;
    }

    @Override
    public int hashCode() {
        int result = resultsFrom != null ? resultsFrom.hashCode() : 0;
        result = 31 * result + (resultsPerPage != null ? resultsPerPage.hashCode() : 0);
        result = 31 * result + (resultsTotal != null ? resultsTotal.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "resultsFrom=" + resultsFrom +
                ", resultsPerPage=" + resultsPerPage +
                ", resultsTotal=" + resultsTotal +
                '}';
    }

    public static final class Builder {

        private Integer resultsFrom;
        private Integer resultsPerPage;
        private Integer resultsTotal;

        private Builder() {
        }

        public PageInfo.Builder resultsFrom(Integer resultsFrom) {
            this.resultsFrom = resultsFrom;
            return this;
        }

        public PageInfo.Builder resultsPerPage(Integer resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
            return this;
        }

        public PageInfo.Builder resultsTotal(Integer resultsTotal) {
            this.resultsTotal = resultsTotal;
            return this;
        }

        public PageInfo build() {
            return new PageInfo(resultsFrom, resultsPerPage, resultsTotal);
        }
    }
}
