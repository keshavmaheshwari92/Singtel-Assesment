package com.animal;

public class Animal {
	
	private boolean canSwim;
	
	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
		displayMessageSwim(canSwim);
	}

	private boolean canFly;
	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
		displayMessageFly(canFly);
	}
	
	public Animal() {
	}
	
	public Animal(boolean canSwim, boolean canFly) {
		super();
		this.canSwim = canSwim;
		this.canFly = canFly;
	}
	
	private void displayMessageSwim(boolean bool) {
		if(bool) {
			System.out.println("Can Swim");
		}else {
			System.out.println("Cannot Swim");
		}
	}
	
	private void displayMessageFly(boolean bool) {
		if(bool) {
			System.out.println("Can Fly");
		}else {
			System.out.println("Cannot Fly");
		}
	}
	
}
