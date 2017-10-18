package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.total.send response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-06 11:37:37
 */
public class AlipayOpenPublicMessageTotalSendResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 1215648352883435354L;
=======
	private static final long serialVersionUID = 3778851815663584428L;
>>>>>>> master

	/** 
	 * 消息ID
	 */
	@ApiField("message_id")
	private String messageId;

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageId( ) {
		return this.messageId;
	}

}
