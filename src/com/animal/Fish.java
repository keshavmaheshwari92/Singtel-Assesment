package com.animal;

public class Fish extends Animal{
	
	private String size;
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Fish(String size, String colour, boolean eatOtherFish, boolean makeJokes) {
		super();
		this.size = size;
		this.colour = colour;
		this.eatOtherFish = eatOtherFish;
		this.makeJokes = makeJokes;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	private String colour;
	private boolean eatOtherFish;
	public boolean getEatOtherFish() {
		return eatOtherFish;
	}

	public void setEatOtherFish(boolean eatOtherFish) {
		this.eatOtherFish = eatOtherFish;
	}
	private boolean makeJokes;
	public boolean getMakeJokes() {
		return makeJokes;
	}

	public void setMakeJokes(boolean makeJokes) {
		this.makeJokes = makeJokes;
	}
	
	public void sing() {
		System.out.println("Fishes cannot sing");
	}
	
	public void walk() {
		System.out.println("Fishes cannot walk");
	}
	public void swim() {
		System.out.println("Fishes can swim");
	}
}
