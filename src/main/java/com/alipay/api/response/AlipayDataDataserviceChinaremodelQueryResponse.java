package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayChinareModelResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.chinaremodel.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-02 14:27:15
 */
public class AlipayDataDataserviceChinaremodelQueryResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 3886412429779359193L;
=======
	private static final long serialVersionUID = 1215115617639293165L;
>>>>>>> master

	/** 
	 * 中再核保模型查询结果
	 */
	@ApiField("result")
	private AlipayChinareModelResult result;

	public void setResult(AlipayChinareModelResult result) {
		this.result = result;
	}
	public AlipayChinareModelResult getResult( ) {
		return this.result;
	}

}
