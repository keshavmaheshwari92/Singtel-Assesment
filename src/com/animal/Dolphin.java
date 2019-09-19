package com.animal;

public class Dolphin extends Animal{
	
	Fish fish;

	public Dolphin(Fish fish) {
		this.fish = fish;
	}
	public void swim() {
		System.out.println("I am swimming");
	}
}
