package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv代创建生活号申请状态查询接口
 *
 * @author auto create
 * @since 1.0, 2017-10-10 11:16:11
 */
public class AlipayOpenPublicLifeAgentcreateQueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 7191333328884985753L;
=======
	private static final long serialVersionUID = 5627982289531385716L;
>>>>>>> master

	/**
	 * 由开发者创建的外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
