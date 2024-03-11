package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.Contact;
import com.jspiders.designpatterns.creational.ContactBuilder;

public class ContactMain {
public static void main(String[] args) {
	Contact contact=new ContactBuilder().setFirstName("ram").setMobile(9875678756l).buildContact();
	System.out.println(contact);
}
}
