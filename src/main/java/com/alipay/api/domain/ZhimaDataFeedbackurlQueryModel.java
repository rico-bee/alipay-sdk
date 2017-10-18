package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取数据反馈模板
 *
 * @author auto create
 * @since 1.0, 2017-02-16 15:46:19
 */
public class ZhimaDataFeedbackurlQueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 6517968184385611255L;
=======
	private static final long serialVersionUID = 8223439995164631277L;
>>>>>>> master

	/**
	 * 在支付宝商户版注册支付宝账号id
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
