package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:35
 */
public class AlipayMarketingCardBenefitCreateResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 4725748589482296792L;
=======
	private static final long serialVersionUID = 4588434655966955421L;
>>>>>>> master

	/** 
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
