package com.example.demo;

public class ClassA {

	private String message;

	private String type;

	public ClassA() {

		this.message = new ClassB().getGrettings();
		this.type = "ClassA_type";

	}

	public String getMessage() {

		return this.message;

	}

	public String getType() {
		
		return this.type;
	
	}

}
