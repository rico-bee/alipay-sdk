package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.userblacklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-04 17:13:07
 */
public class AlipayCommerceTransportOfflinepayUserblacklistQueryResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 5886736368443576918L;
=======
	private static final long serialVersionUID = 3535563112749967118L;
>>>>>>> master

	/** 
	 * 黑名单用户ID
	 */
	@ApiListField("black_list")
	@ApiField("string")
	private List<String> blackList;

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}
	public List<String> getBlackList( ) {
		return this.blackList;
	}

}
