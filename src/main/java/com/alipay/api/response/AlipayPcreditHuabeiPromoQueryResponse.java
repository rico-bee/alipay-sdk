package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-03 17:48:05
 */
public class AlipayPcreditHuabeiPromoQueryResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 5421436763254819912L;
=======
	private static final long serialVersionUID = 1862945251636984136L;
>>>>>>> master

	/** 
	 * 花呗颜值分
	 */
	@ApiField("facescore")
	private String facescore;

	public void setFacescore(String facescore) {
		this.facescore = facescore;
	}
	public String getFacescore( ) {
		return this.facescore;
	}

}
