package com.geeksoft.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name="orders")
public class Orders {
	@Id
	@Column(name="ONUM")
	private String orderNo;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	

}
