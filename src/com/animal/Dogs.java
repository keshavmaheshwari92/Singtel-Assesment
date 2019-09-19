package com.animal;

public class Dogs {
	
Parrot parrot = new Parrot();

public Parrot getParrot() {
	return parrot;
}
public void setParrot(Parrot parrot) {
	this.parrot = parrot;
}
public Dogs() {
	parrot.setStaysWith("Dogs");
}


}
