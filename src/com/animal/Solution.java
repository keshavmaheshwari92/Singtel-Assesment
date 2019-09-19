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