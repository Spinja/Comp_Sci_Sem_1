package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	Scanner sc = new Scanner(System.in);
	int example = 0;
	public String rolex;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;

	public myCharacter(){
		rolex = "No Role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	
	public myCharacter(String rolex){
		this.rolex = rolex;
		
		if(rolex.equals("Wizard") || rolex.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
			rolex = "Wizard";
		}
		else if(rolex.equals("Rogue") || rolex.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			rolex = "Rogue";
		}
		else if(rolex.equals("Warrior") || rolex.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
			rolex = "Warrior";
		}
		else{
			System.out.println("Sorry, that isn't one of the roles.");
			rolex = "No Role";
		}
	}
	
	public void myToString(){
		System.out.println("Your role is " + rolex);
		System.out.println("Your strength stat is " + strength);
		System.out.println("Your dexterity stat is " + dexterity);
		System.out.println("Your intelligence stat is " + intelligence);
		System.out.println("Your constitution stat is " + constitution);
		System.out.println("Your charisma stat is " + charisma);
	}
}

