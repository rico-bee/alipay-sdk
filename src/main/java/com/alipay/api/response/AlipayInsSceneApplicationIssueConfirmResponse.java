package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.issue.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-28 17:19:31
 */
public class AlipayInsSceneApplicationIssueConfirmResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 8481934728847955789L;
=======
	private static final long serialVersionUID = 2746477427716185488L;
>>>>>>> master

	/** 
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getApplicationNo( ) {
		return this.applicationNo;
	}

}
