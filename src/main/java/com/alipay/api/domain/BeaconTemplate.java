package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蓝牙设备模板信息
 *
 * @author auto create
 * @since 1.0, 2015-02-03 19:55:34
 */
public class BeaconTemplate extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 1888287167878333336L;
=======
	private static final long serialVersionUID = 3282521381385713649L;
>>>>>>> master

	/**
	 * 模板参数信息
	 */
	@ApiField("context")
	private String context;

	/**
	 * 模板ID
	 */
	@ApiField("templateid")
	private String templateid;

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getTemplateid() {
		return this.templateid;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}

}
