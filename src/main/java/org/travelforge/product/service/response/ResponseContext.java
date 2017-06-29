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
public final class ResponseContext implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String client;
    private final String market;
    private final String language;
    private final String currency;

    private ResponseContext(String client, String market, String language, String currency) {
        this.client = client;
        this.market = market;
        this.language = language;
        this.currency = currency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getClient() {
        return this.client;
    }

    public String getMarket() {
        return this.market;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getCurrency() {
        return this.currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponseContext context = (ResponseContext) o;

        if (client != null ? !client.equals(context.client) : context.client != null) return false;
        if (market != null ? !market.equals(context.market) : context.market != null) return false;
        if (language != null ? !language.equals(context.language) : context.language != null) return false;
        return currency != null ? currency.equals(context.currency) : context.currency == null;
    }

    @Override
    public int hashCode() {
        int result = client != null ? client.hashCode() : 0;
        result = 31 * result + (market != null ? market.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResponseContext{" +
                "client='" + client + '\'' +
                ", market='" + market + '\'' +
                ", language='" + language + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

    public static final class Builder {

        private String client;
        private String market;
        private String language;
        private String currency;

        private Builder() {
        }

        public ResponseContext.Builder client(String client) {
            this.client = client;
            return this;
        }

        public ResponseContext.Builder market(String market) {
            this.market = market;
            return this;
        }

        public ResponseContext.Builder language(String language) {
            this.language = language;
            return this;
        }

        public ResponseContext.Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public ResponseContext build() {
            return new ResponseContext(client, market, language, currency);
        }
    }
}
