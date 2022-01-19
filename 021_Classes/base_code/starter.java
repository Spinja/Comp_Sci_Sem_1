import java.util.Scanner;
import java.util.Random;

class Character {
	String role = new String("Wizard");
	int strength = 1;
	int dexterity = 7;
	int intelligence = 5;
	int constitution = 4;
	int charisma = 6;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character rpg = new Character();
		
		if(rpg.strength == 1 && rpg.dexterity == 7){
			System.out.println("Your role is " + rpg.role);
			System.out.println("Your strength trait is " + rpg.strength);
			System.out.println("Your dexterity trait is " + rpg.dexterity);
			System.out.println("Your intelligence trait is " + rpg.intelligence);
			System.out.println("Your constitution trait is " + rpg.constitution);
			System.out.println("Your charisma trait is " + rpg.charisma);
		}
		
	}
}
