/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.commerceservices.externaltax;

import de.hybris.platform.core.model.order.AbstractOrderModel;


/**
 * Abstraction for service to decide whether the external taxes of an order need recalculation
 * 
 */
public interface RecalculateExternalTaxesStrategy
{
	String SESSION_ATTIR_ORDER_RECALCULATION_HASH = "orderRecalculationHash";

	boolean recalculate(AbstractOrderModel abstractOrderModel);
}
