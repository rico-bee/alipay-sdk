package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-添加标签
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */
public class AlipayOpenPublicLabelCreateModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 7749356273221467174L;
=======
	private static final long serialVersionUID = 7762895615215614694L;
>>>>>>> master

	/**
	 * 标签名
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
