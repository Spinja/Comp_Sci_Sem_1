import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter z = new myCharacter();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your role?");
		String role = sc.nextLine();
		System.out.println();
		
		z = new myCharacter(role);
		System.out.println();
		z.levelUp();
		System.out.println();
		z.levelUp();
	}
}
