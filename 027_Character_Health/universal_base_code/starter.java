import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter gesund = new myCharacter();
		
		gesund.setRole("Warrior");
		gesund.setConstitution(10);
		System.out.println("Constitution set to 10");
		gesund.setMaxHealth();
		gesund.setHealth(1);


		
	}
}
