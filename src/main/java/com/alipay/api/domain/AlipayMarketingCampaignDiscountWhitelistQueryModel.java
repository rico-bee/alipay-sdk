package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠活动白名单查询
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:48:04
 */
public class AlipayMarketingCampaignDiscountWhitelistQueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 7758515557699252791L;
=======
	private static final long serialVersionUID = 1751998417392787115L;
>>>>>>> master

	/**
	 * 活动od
	 */
	@ApiField("camp_id")
	private String campId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
