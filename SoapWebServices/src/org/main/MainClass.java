package org.main;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

public class MainClass {

	public static void main(String[] args) {

		Calculator cal=new Calculator();
		CalculatorSoap calSoap=cal.getCalculatorSoap();
		
		System.out.println("*****ADD*****");
		System.out.println(calSoap.add(1, 2));
		
		System.out.println("*****subtract*****");
		System.out.println(calSoap.subtract(4,2));
		
		System.out.println("*****divide*****");
		System.out.println(calSoap.divide(8, 2));
		
		System.out.println("*****multiply*****");
		System.out.println(calSoap.multiply(2, 3));
		
		
		
	}

}
