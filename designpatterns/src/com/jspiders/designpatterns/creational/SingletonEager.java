package com.jspiders.designpatterns.creational;

public class SingletonEager {
private static  SingletonEager singletonEager=new SingletonEager();
private SingletonEager() {
	System.out.println("constructor is invoked");
}
public static SingletonEager getObject() {
	return singletonEager;
}
}
