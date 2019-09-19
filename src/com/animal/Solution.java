package com.animal;

public class Solution {
	 public static void main(String[] args) {
	 Bird bird = new Bird();
	 bird.walk();
	 bird.fly();
	 bird.sing();
	 Duck duck=new Duck();
	 duck.setCanSwim(true);
	 duck.sing();
	 Chicken chicken = new Chicken();
	 chicken.setCanFly(false);
	 chicken.sing();
	 Rooster rooster = new Rooster();
	 rooster.sing();
	 Dogs dogs = new Dogs();
	 sing(dogs.getParrot());
	 Cats cats = new Cats();
	 sing(cats.getParrot());
	 Rooster roosterNearParrot = new Rooster();
	 sing(roosterNearParrot.getParrot());
	 Shark shark = new Shark("Large", "Grey", true, false);
	 showMessageForFishes(shark);
	 Clownfish clownfish = new Clownfish("small", "Orange", false, true);
	 showMessageForFishes(clownfish);
	 }
	 
	 private static void showMessageForFishes(Fish fish) {
		// TODO Auto-generated method stub
		if(fish instanceof Shark && fish.getEatOtherFish() == true) {
			System.out.println("Shark size is " +fish.getSize()
			                    +" and its colour is " + fish.getColour()
			                    + " Sharks also eats other Fishes");
			
		}
		else if(fish instanceof Clownfish && fish.getMakeJokes() == true) {
			System.out.println("Clownfish size is " +fish.getSize()
            +" and its colour is " + fish.getColour()
            + " Clownfish make jokes");
		}
		
	}

	public static void sing(Parrot parrot) {
			if(parrot.getStaysWith()=="Dogs") {
			System.out.println("Woof, woof");
			}
			else if(parrot.getStaysWith()=="Cats") {
				System.out.println("Meow");
			}
			else if(parrot.getStaysWith()=="Rooster") {
				System.out.println("Cock-a-doodle-doo");
			}
		}
}