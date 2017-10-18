package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠活动查看
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class AlipayMarketingCampaignDiscountQueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 2247791247426392168L;
=======
	private static final long serialVersionUID = 5416992986859268614L;
>>>>>>> master

	/**
	 * 活动id
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
