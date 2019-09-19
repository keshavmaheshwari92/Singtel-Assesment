package com.animal;

public class Bird extends Animal {
	
private String  staysWith;
	
	public String getStaysWith() {
		return staysWith;
	}

	public void setStaysWith(String staysWith) {
		this.staysWith = staysWith;
	}

	
	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("I am singing");
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
}