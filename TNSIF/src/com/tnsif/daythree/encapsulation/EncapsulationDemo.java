package com.tnsif.daythree.encapsulation;

public class EncapsulationDemo {
public static void main(String[] args) {
		
		//object creation 
		OopsConceptDemo obj=new OopsConceptDemo();
		
		obj.setSerialNum(1000);
		obj.setName("Mayur");
		obj.setAge(21);
		
		System.out.println(obj);
		
		System.out.println(obj.getSerialNum());
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}
