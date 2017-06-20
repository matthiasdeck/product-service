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
package org.travelforge.product.service;

import org.travelforge.product.service.request.*;
import org.travelforge.product.service.response.PackageGroupResponse;
import org.travelforge.product.service.response.PackageProductResponse;

/**
 * @author Matthias Deck
 */
public interface PackageProductService {

    static PackageProductService newInstance(PackageProductServiceConnector connector) {

        return new PackageProductService() {

            @Override
            public PackageGroupResponse getPackageGroups(PackageGroupRequest request) throws ProductServiceException {
                return connector.executePackageGroupRequest(request);
            }

            @Override
            public PackageProductResponse getPackageProducts(PackageProductRequest request) throws ProductServiceException {
                return connector.executePackageProductRequest(request);
            }

            @Override
            public PackageProductResponse getPackageOffers(PackageOfferRequest request) throws ProductServiceException {
                return connector.executePackageOfferRequest(request);
            }

            @Override
            public PackageProductResponse getPackageVariants(PackageVariantRequest request) throws ProductServiceException {
                return connector.executePackageVariantRequest(request);
            }

            @Override
            public PackageProductResponse getPackageFlightAlternatives(PackageFlightAlternativesRequest request) throws ProductServiceException {
                return connector.executePackageFlightAlternativesRequest(request);
            }
        };
    }

    PackageGroupResponse getPackageGroups(PackageGroupRequest request) throws ProductServiceException;

    PackageProductResponse getPackageProducts(PackageProductRequest request) throws ProductServiceException;

    PackageProductResponse getPackageOffers(PackageOfferRequest request) throws ProductServiceException;

    PackageProductResponse getPackageVariants(PackageVariantRequest request) throws ProductServiceException;

    PackageProductResponse getPackageFlightAlternatives(PackageFlightAlternativesRequest request) throws ProductServiceException;
}
