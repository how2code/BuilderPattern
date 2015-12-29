package com.how2code.designpattern.builder.abstractbuilder;

import com.how2code.designpattern.builder.product.Bread;

public abstract class BreadBuilder {
	
	protected Bread bread;
	
	public void newBreadInstance() { 
		bread = new Bread(); 
	}
	
	public Bread getBread() {
		return bread;
	}
	
	public abstract void setFlourType();
	public abstract void setFlourQuantity();
	public abstract void setYeastQuantity();

}
