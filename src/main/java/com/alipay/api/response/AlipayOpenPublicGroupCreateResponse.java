package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-14 15:10:37
 */
public class AlipayOpenPublicGroupCreateResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 2543447292951361654L;
=======
	private static final long serialVersionUID = 6695633353229948625L;
>>>>>>> master

	/** 
	 * 分组id
	 */
	@ApiField("group_id")
	private String groupId;

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

}
