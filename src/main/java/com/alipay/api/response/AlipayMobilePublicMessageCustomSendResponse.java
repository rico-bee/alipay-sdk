package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.message.custom.send response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-09 11:58:04
 */
public class AlipayMobilePublicMessageCustomSendResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 6511241518935692528L;
=======
	private static final long serialVersionUID = 5632638218849427423L;
>>>>>>> master

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
