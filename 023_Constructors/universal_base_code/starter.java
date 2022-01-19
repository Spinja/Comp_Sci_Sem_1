import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter none = new myCharacter();
		
		System.out.println("Your role is " + none.rolex);
		System.out.println("Your strength stat is " + none.strength);
		System.out.println("Your dexterity stat is " + none.dexterity);
		System.out.println("Your intelligence stat is " + none.intelligence);
		System.out.println("Your constitution stat is " + none.constitution);
		System.out.println("Your charisma stat is " + none.charisma);
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("What is your role?");
		String bun = sc.nextLine();
		none = new myCharacter(bun);
		
		System.out.println("Your role is " + none.rolex);
		System.out.println("Your strength stat is " + none.strength);
		System.out.println("Your dexterity stat is " + none.dexterity);
		System.out.println("Your intelligence stat is " + none.intelligence);
		System.out.println("Your constitution stat is " + none.constitution);
		System.out.println("Your charisma stat is " + none.charisma);
		
	}
}
