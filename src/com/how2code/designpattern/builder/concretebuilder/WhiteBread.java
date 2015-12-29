package com.how2code.designpattern.builder.concretebuilder;

import com.how2code.designpattern.builder.abstractbuilder.BreadBuilder;

public class WhiteBread extends BreadBuilder {

	@Override
	public void setFlourType() {
		bread.setFlourType("Flour Type 00");
	}

	@Override
	public void setFlourQuantity() {
		bread.setFlourQuantity(1000);
	}

	@Override
	public void setYeastQuantity() {
		bread.setYeastQuantity(25);
	}

}
