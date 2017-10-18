package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:11
 */
public class AlipayMarketingToolFengdieActivityQueryResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 8785955347379189957L;
=======
	private static final long serialVersionUID = 5322352553155465782L;
>>>>>>> master

	/** 
	 * H5应用详情
	 */
	@ApiField("activity")
	private FengdieActivity activity;

	public void setActivity(FengdieActivity activity) {
		this.activity = activity;
	}
	public FengdieActivity getActivity( ) {
		return this.activity;
	}

}
