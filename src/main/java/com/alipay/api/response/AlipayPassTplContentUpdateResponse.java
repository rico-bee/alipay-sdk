package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.tpl.content.update response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-01 15:29:44
 */
public class AlipayPassTplContentUpdateResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 2151432468934598911L;
=======
	private static final long serialVersionUID = 7675331972992593249L;
>>>>>>> master

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 业务结果数据：包含serialNumber, pass_Id和操作类型
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作是否成功标识：T标识成功；F标识失败
	 */
	@ApiField("success")
	private String success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
