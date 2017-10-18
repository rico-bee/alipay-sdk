package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级商户信息
 *
 * @author auto create
 * @since 1.0, 2017-05-03 13:59:11
 */
public class SubMerchant extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 5553968459179884525L;
=======
	private static final long serialVersionUID = 6882379547366877665L;
>>>>>>> master

	/**
	 * 二级商户的支付宝id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
