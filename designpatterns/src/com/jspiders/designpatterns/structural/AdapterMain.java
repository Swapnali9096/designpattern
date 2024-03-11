package com.jspiders.designpatterns.structural;

public class AdapterMain {
public static void main(String[] args) {
	Adapter adapter=new Adapter();
	adapter.setName("ramesh");
	adapter.mensDay();
	adapter.setName("roma");
	adapter.womensDay();
}
}
