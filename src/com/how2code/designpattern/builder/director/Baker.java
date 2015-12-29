package com.how2code.designpattern.builder.director;

import com.how2code.designpattern.builder.abstractbuilder.BreadBuilder;
import com.how2code.designpattern.builder.product.Bread;

public class Baker {
	private BreadBuilder breadBuilder;

	public void setBreadBuilder(BreadBuilder builder) { 
		breadBuilder = builder; 
	}
	
	public Bread getBread() { 
		return breadBuilder.getBread();
	}

	public void buildBread() {
		breadBuilder.newBreadInstance();
		breadBuilder.setFlourType();
		breadBuilder.setFlourQuantity();
		breadBuilder.setYeastQuantity();
	}
}
