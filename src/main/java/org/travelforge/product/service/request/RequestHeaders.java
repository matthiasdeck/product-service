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

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Matthias Deck
 */
public class RequestHeaders implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String LANGUAGE = "language";
    public static final String CURRENCY = "currency";

    private Map<String, Object> parameters = new TreeMap<>();

    @SuppressWarnings("unchecked")
    public String getLanguage() {
        return (String) parameters.get(LANGUAGE);
    }

    @JsonSetter(LANGUAGE)
    public void setLanguage(String language) {
        parameters.put(LANGUAGE, language);
    }

    @SuppressWarnings("unchecked")
    public String getCurrency() {
        return (String) parameters.get(CURRENCY);
    }

    @JsonSetter(CURRENCY)
    public void setCurrency(String currency) {
        parameters.put(CURRENCY, currency);
    }

    public Object get(String name) {
        return parameters.get(name);
    }

    @JsonAnySetter
    public void set(String name, Object value) {
        parameters.put(name, value);
    }

    @JsonValue
    public Map<String, Object> toMap() {
        return Collections.unmodifiableMap(this.parameters);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestHeaders headers = (RequestHeaders) o;

        return parameters != null ? parameters.equals(headers.parameters) : headers.parameters == null;
    }

    @Override
    public int hashCode() {
        return parameters != null ? parameters.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RequestHeaders{" +
                "parameters=" + parameters +
                '}';
    }
}
