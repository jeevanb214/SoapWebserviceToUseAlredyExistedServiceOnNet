# SoapWebserviceToUseAlredyExistedServiceOnNet
Soap Webservice To Use Alredy Existed Service On Net for adding,sub……. the numbers

1)Generate Studs.
		Use the command 
			wsimport  -keep -s srcfolder   https:/…………………………


----->Srcfolder  is a folder where you want to store the .java files.
----->https:/……….  This Is the link which is wsdl is there (by using this wsdl we are going to generte the .java 
filesz	


The generated .java files are called as stubs

Example for link http://www.dneonline.com/calculator.asmx?wsdl  for adding,sub……. the numbers

		---> in the wsdl file from the above link we don’t need to worry about knowing all,  just concentrate on the name of the	-----> service     i.e   <wsdl:service name="Calculator">
------>port    	        <wsdl:port name="CalculatorSoap"


2)Add jars		a)  javax.jws-3.1.2
			b)  jaxb-api-2.2.3
			c) jaxws-api-2.2.1
		d)--> also add the dependecy
	<dependencies>
		<dependency>
			<groupId>com.sun.xml.ws</groupId>
			<artifactId>rt</artifactId>
			<version>2.3.2</version>
		</dependency>
	</dependencies> 

3)
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


