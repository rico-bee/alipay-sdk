package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.hide.deviceid.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-17 15:05:08
 */
public class AlipaySecurityRiskHideDeviceidQueryResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 3646775898385453162L;
=======
	private static final long serialVersionUID = 7353245682319268414L;
>>>>>>> master

	/** 
	 * 设备指纹的apdid
	 */
	@ApiField("deviceid")
	private String deviceid;

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceid( ) {
		return this.deviceid;
	}

}
