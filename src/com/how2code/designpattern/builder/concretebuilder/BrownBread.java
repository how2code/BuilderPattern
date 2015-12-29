package com.how2code.designpattern.builder.concretebuilder;

import com.how2code.designpattern.builder.abstractbuilder.BreadBuilder;

public class BrownBread extends BreadBuilder {

	@Override
	public void setFlourType() {
		bread.setFlourType("Brown Flour");
	}

	@Override
	public void setFlourQuantity() {
		bread.setFlourQuantity(500);
	}

	@Override
	public void setYeastQuantity() {
		bread.setYeastQuantity(12);
	}

}
