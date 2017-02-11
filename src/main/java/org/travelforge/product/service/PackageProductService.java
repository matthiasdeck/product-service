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

import org.travelforge.product.model.PackageProductGroup;
import org.travelforge.product.model.PackageProductList;
import org.travelforge.product.service.request.PackageGroupRequest;
import org.travelforge.product.service.request.PackageOfferRequest;
import org.travelforge.product.service.request.PackageProductRequest;
import org.travelforge.product.service.request.PackageVariantRequest;

/**
 * @author Matthias Deck
 */
public interface PackageProductService {

    PackageProductGroup getPackageGroups(PackageGroupRequest request) throws ProductServiceException;
    PackageProductList getPackageProducts(PackageProductRequest request) throws ProductServiceException;
    PackageProductList getPackageOffers(PackageOfferRequest request) throws ProductServiceException;
    PackageProductList getPackageVariants(PackageVariantRequest request) throws ProductServiceException;
}
