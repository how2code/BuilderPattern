package com.how2code.designpattern.builder.product;

public class Bread {
	
	private String flourType;
	private int flourQuantity;
	private int yeastQuantity;
	
	public String getFlourType() {
		return flourType;
	}
	public void setFlourType(String flourType) {
		this.flourType = flourType;
	}
	public int getFlourQuantity() {
		return flourQuantity;
	}
	public void setFlourQuantity(int flourQuantity) {
		this.flourQuantity = flourQuantity;
	}
	public int getYeastQuantity() {
		return yeastQuantity;
	}
	public void setYeastQuantity(int yeastQuantity) {
		this.yeastQuantity = yeastQuantity;
	}

}
