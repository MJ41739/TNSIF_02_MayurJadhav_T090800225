package com.tnsif.daythree.encapsulation;

public class OopsConceptDemo {
	//Data members
		private int serialNum;
		private String name;
		private int age;
		
		//getter and setter 
		public int getSerialNum() {
			return serialNum;
		}
		public void setSerialNum(int serialNum) {
			this.serialNum = serialNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		//to string 
		//object class method - to return string representation 
		//of the object
		@Override
		public String toString() {
			return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
		}
}
