package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受理外汇交易请求
 *
 * @author auto create
 * @since 1.0, 2017-07-20 10:41:43
 */
public class AlipayAccountExrateTraderequestCreateModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 2248943319555482653L;
=======
	private static final long serialVersionUID = 4189311828247144353L;
>>>>>>> master

	/**
	 * 交易请求对象内容
	 */
	@ApiField("trade_request")
	private TradeRequestVO tradeRequest;

	public TradeRequestVO getTradeRequest() {
		return this.tradeRequest;
	}
	public void setTradeRequest(TradeRequestVO tradeRequest) {
		this.tradeRequest = tradeRequest;
	}

}
