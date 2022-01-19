import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter wow = new myCharacter();
		
		int roletf = 0;
		
		System.out.println("What is your name, hero?");
		String name = sc.nextLine();
		
		System.out.println("What is your title? (EX: Slayer of Dragons)");
		String title = sc.nextLine();
		
		while(roletf == 0){
			System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
			String role = sc.nextLine();
			wow.setRole(role);
			if(!wow.rolex.equals("No Role")){
				roletf = 1;
			}
		}
		
		System.out.println();
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		
		while(wow.toohi == 2){	
			System.out.println("Strength (1 - 10): ");
			int stronk = sc.nextInt();
			wow.setStrength(stronk);
		}
		
		while(wow.toohi == 3){
			System.out.println("Dexterity (1 - 10): ");
			int dext = sc.nextInt();
			wow.setDexterity(dext);
		}
		
		while(wow.toohi == 4){
			System.out.println("Intelligence (1 - 10): ");
			int inte = sc.nextInt();
			wow.setIntelligence(inte);
		}
		
		while(wow.toohi == 5){
			System.out.println("Constitution (1 - 10): ");
			int con = sc.nextInt();
			wow.setConstitution(con);
		}
		
		while(wow.toohi == 6){
			System.out.println("Charisma (1 - 10): ");
			int chacha = sc.nextInt();
			wow.setCharisma(chacha);
		}
		
		wow.myToString();
		
	}
}
