package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营参谋会员人物画像查询
 *
 * @author auto create
<<<<<<< HEAD
 * @since 1.0, 2017-10-02 18:21:01
 */
public class KoubeiMarketingDataBizadviserMemberprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7693961887369511138L;
=======
 * @since 1.0, 2017-08-25 10:59:20
 */
public class KoubeiMarketingDataBizadviserMemberprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1787868465836976784L;
>>>>>>> master

	/**
	 * 会员分层，可传 ALL/4/3/2/1  五个值
传ALL查询所有分层的汇总；
传4查询 流失客层级的；
传3查询 过客层级的；
传2查询 新客层级的；
传1查询 回头客层级的；
	 */
	@ApiField("member_grade")
	private String memberGrade;

	public String getMemberGrade() {
		return this.memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

}
