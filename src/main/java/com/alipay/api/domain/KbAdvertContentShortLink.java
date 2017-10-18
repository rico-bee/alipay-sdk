package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统短链内容详情
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertContentShortLink extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 6487154654794586776L;
=======
	private static final long serialVersionUID = 7842265696666156597L;
>>>>>>> master

	/**
	 * 链接地址
	 */
	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
