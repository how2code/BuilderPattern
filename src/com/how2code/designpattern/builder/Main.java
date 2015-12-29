package com.how2code.designpattern.builder;

import com.how2code.designpattern.builder.abstractbuilder.BreadBuilder;
import com.how2code.designpattern.builder.concretebuilder.BrownBread;
import com.how2code.designpattern.builder.concretebuilder.WhiteBread;
import com.how2code.designpattern.builder.director.Baker;
import com.how2code.designpattern.builder.product.Bread;

public class Main {

	public static void main(String[] args) {
		Baker baker = new Baker();
		
		BreadBuilder whiteBread = new WhiteBread();
		BreadBuilder brownBread = new BrownBread();
		
		baker.setBreadBuilder(whiteBread);
		baker.buildBread();
		
		Bread bread = baker.getBread();
		System.out.println("White Bread:: Flour Type: " + bread.getFlourType());
		System.out.println("White Bread:: Flour Quantity: " + bread.getFlourQuantity());
		System.out.println("White Bread:: Yeast Quantity: " + bread.getYeastQuantity());
		
		System.out.println();
		
		baker.setBreadBuilder(brownBread);
		baker.buildBread();
		
		bread = baker.getBread();
		System.out.println("Brown Bread:: Flour Type: " + bread.getFlourType());
		System.out.println("Brown Bread:: Flour Quantity: " + bread.getFlourQuantity());
		System.out.println("Brown Bread:: Yeast Quantity: " + bread.getYeastQuantity());
	}

}
