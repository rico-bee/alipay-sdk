package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.template.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-02 17:35:28
 */
public class AlipayMobilePublicTemplateMessageQueryResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 4275989771294456512L;
=======
	private static final long serialVersionUID = 3656927923554871423L;
>>>>>>> master

	/** 
	 * 结果值
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
