package com.jspiders.designpatterns.structural;

public class Adapter extends Employee implements Event {

	@Override
	public void womensDay() {
		System.out.println("the chief guest for women's day is" +getName());
		
	}

	@Override
	public void mensDay() {
		System.out.println("the chief guest for men's day is" +getName());

	}


}
