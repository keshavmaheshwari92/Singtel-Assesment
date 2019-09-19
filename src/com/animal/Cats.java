package com.animal;

public class Cats {
	
	Parrot parrot = new Parrot();

	public Parrot getParrot() {
		return parrot;
	}
	public void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}
	public Cats() {
		parrot.setStaysWith("Cats");
	}
}
