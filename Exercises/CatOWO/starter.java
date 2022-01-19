import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Cat{
	String name = new String();
	
	public Cat(){
		name = "Garfield";
	}
	
	public Cat(String omo){
		name = omo;
	}
	
	public void meow(){
		System.out.println(name + ": meow");
	}
}

class starter {
	public static void main(String args[]) {
		Cat mew = new Cat();
		mew.meow();
		mew = new Cat("Meowth");
		mew.meow();
		
	}
}
