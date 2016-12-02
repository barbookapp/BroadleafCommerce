/*
 * #%L
 * BroadleafCommerce Framework Web
 * %%
 * Copyright (C) 2009 - 2016 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.core.web.api.wrapper;

import org.broadleafcommerce.core.order.domain.OrderItemQualifier;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @deprecated - use {@link com.broadleafcommerce.core.rest.api.v2.wrapper.OrderItemQualifierWrapper}
 *
 */

@Deprecated
@XmlRootElement(name = "orderItemQualifier")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class OrderItemQualifierWrapper extends BaseWrapper implements APIWrapper<OrderItemQualifier> {

    @XmlElement
    protected Long offerId;

    @XmlElement
    protected Long quantity;

    @Override
    public void wrapDetails(OrderItemQualifier model, HttpServletRequest request) {
        this.offerId = model.getOffer().getId();
        this.quantity = model.getQuantity();
    }

    @Override
    public void wrapSummary(OrderItemQualifier model, HttpServletRequest request) {
        wrapDetails(model, request);
    }

    
    /**
     * @return the offerId
     */
    public Long getOfferId() {
        return offerId;
    }

    
    /**
     * @param offerId the offerId to set
     */
    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    
    /**
     * @return the quantity
     */
    public Long getQuantity() {
        return quantity;
    }

    
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

}