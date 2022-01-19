import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter none = new myCharacter();
		
		none.myToString();
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("What is your role?");
		String bun = sc.nextLine();
		none = new myCharacter(bun);
		
		none.myToString();
		
	}
}
