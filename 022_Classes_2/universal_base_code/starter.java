import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		MyCharacter rpg = new MyCharacter();
		
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
