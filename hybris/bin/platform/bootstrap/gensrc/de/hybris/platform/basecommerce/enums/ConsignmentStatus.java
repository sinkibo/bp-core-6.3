/*
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.basecommerce.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum ConsignmentStatus declared at extension basecommerce.
 */
@SuppressWarnings("PMD")
public enum ConsignmentStatus implements HybrisEnumValue
{
	/**
	 * Generated enum value for ConsignmentStatus.READY_FOR_PICKUP declared at extension commerceservices.
	 */
	READY_FOR_PICKUP("READY_FOR_PICKUP"),
	/**
	 * Generated enum value for ConsignmentStatus.READY_FOR_SHIPPING declared at extension warehousing.
	 */
	READY_FOR_SHIPPING("READY_FOR_SHIPPING"),
	/**
	 * Generated enum value for ConsignmentStatus.WAITING declared at extension basecommerce.
	 */
	WAITING("WAITING"),
	/**
	 * Generated enum value for ConsignmentStatus.PICKPACK declared at extension basecommerce.
	 */
	PICKPACK("PICKPACK"),
	/**
	 * Generated enum value for ConsignmentStatus.PICKUP_COMPLETE declared at extension commerceservices.
	 */
	PICKUP_COMPLETE("PICKUP_COMPLETE"),
	/**
	 * Generated enum value for ConsignmentStatus.READY declared at extension basecommerce.
	 */
	READY("READY"),
	/**
	 * Generated enum value for ConsignmentStatus.SHIPPED declared at extension basecommerce.
	 */
	SHIPPED("SHIPPED"),
	/**
	 * Generated enum value for ConsignmentStatus.CANCELLED declared at extension basecommerce.
	 */
	CANCELLED("CANCELLED");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ConsignmentStatus";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "ConsignmentStatus";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private ConsignmentStatus(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}