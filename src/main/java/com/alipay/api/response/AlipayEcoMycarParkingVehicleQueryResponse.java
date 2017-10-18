package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.vehicle.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-25 17:09:28
 */
public class AlipayEcoMycarParkingVehicleQueryResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 1823636871528726727L;
=======
	private static final long serialVersionUID = 5712328276563918521L;
>>>>>>> master

	/** 
	 * 车牌信息（utf-8编码）
	 */
	@ApiField("car_number")
	private String carNumber;

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarNumber( ) {
		return this.carNumber;
	}

}
