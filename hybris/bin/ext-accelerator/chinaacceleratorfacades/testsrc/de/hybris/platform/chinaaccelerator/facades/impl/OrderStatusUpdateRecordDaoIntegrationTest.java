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
package de.hybris.platform.chinaaccelerator.facades.impl;

import static org.junit.Assert.assertEquals;

import de.hybris.platform.core.model.order.payment.AlipayPaymentInfoModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;


public class OrderStatusUpdateRecordDaoIntegrationTest extends ServicelayerTransactionalTest
{
	@Resource
	private ModelService modelService;

	@Resource
	private FlexibleSearchService flexibleSearchService;

	private static final Logger LOG = Logger.getLogger(OrderStatusUpdateRecordDaoIntegrationTest.class);

	@Test
	public void extendAttributesTest()
	{
		final UserModel um = modelService.create(UserModel.class);
		um.setUid(UUID.randomUUID().toString());

		final int OriginCount = flexibleSearchService.search("select {pk} from {AlipayPaymentInfo} ").getCount();
		final AlipayPaymentInfoModel am = new AlipayPaymentInfoModel();
		am.setCode("TEST-AM");
		am.setUser(um);
		modelService.save(am);
		final int currentCount = flexibleSearchService.search("select {pk} from {AlipayPaymentInfo} ").getCount();
		assertEquals(OriginCount + 1, currentCount);
	}
}