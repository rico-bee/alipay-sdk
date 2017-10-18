package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.partner.menu.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 20:23:59
 */
public class AlipayOpenPublicPartnerMenuQueryResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 3646233978177345385L;
=======
	private static final long serialVersionUID = 7636296797973247178L;
>>>>>>> master

	/** 
	 * 服务窗菜单
	 */
	@ApiField("public_menu")
	private String publicMenu;

	public void setPublicMenu(String publicMenu) {
		this.publicMenu = publicMenu;
	}
	public String getPublicMenu( ) {
		return this.publicMenu;
	}

}
