package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝历史交易查询
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:07:59
 */
public class MybankFinanceYulibaoTransHistoryQueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 4682179929335919483L;
=======
	private static final long serialVersionUID = 6816761192911281588L;
>>>>>>> master

	/**
	 * 查询交易的结束时间，必须是格式为yyyyMMdd的日期字符串，且日期要大于等于start_date，时间最大跨度为30天，如start_date为20160808，则end_date最大值为20160906。
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝。
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 页码，历史交易记录分页展示的页码。必须为正整数，最大值为99。
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 每页条数，历史交易记录查询时每页的最大条数。必须为正整数，最大值为50。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询交易的开始时间，必须是格式为yyyyMMdd的日期字符串，如20160808。
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
