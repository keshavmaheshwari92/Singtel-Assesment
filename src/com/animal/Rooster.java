package com.animal;

public class Rooster extends Bird{

	Parrot parrot = new Parrot();

	public Parrot getParrot() {
		return parrot;
	}
	public void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}
	public Rooster() {
		parrot.setStaysWith("Rooster");
	}
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}
