package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	Scanner sc = new Scanner(System.in);
	String rolex = new String();
	int strength = 0;
	int dexterity = 0;
	int intelligence = 0;
	int constitution = 0;
	int charisma = 0;
	int remaining = 25;
	int toohi = 2;
	int level = 0;
	int points = 0;
	int loop = 0;

	public myCharacter(){
		rolex = "No Role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	
	public myCharacter(String r){
		rolex = r;
		loop = 0;
		
		while(loop == 0){
			if(rolex.equals("Wizard") || rolex.equals("wizard")){
				System.out.println("You've chosen the Wizard! Excelsior!");
				rolex = "Wizard";
				loop = 1;
			}
			else if(rolex.equals("Rogue") || rolex.equals("rogue")){
				System.out.println("You've chosen the Rogue! How cunning!");
				rolex = "Rogue";
				loop = 1;
			}
			else if(rolex.equals("Warrior") || rolex.equals("warrior")){
				System.out.println("You've chosen the Warrior! For honor!");
				rolex = "Warrior";
				loop = 1;
			}
			else{
				System.out.println("Sorry, that isn't one of the roles.");
				rolex = "No Role";
				loop = 0;
			}
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
	
	public String setRole(){
		return rolex;
	}
	
	public String setRole(String you){
		rolex = you;
		
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
		return rolex;
	}
	
	private int setStrength(){
		return strength;
	}
	
	private int setStrength(int s){
		strength = strength + s;
		points = points - s;
		return strength;
	}
	
	private int setDexterity(){
		return dexterity;
	}
	
	private int setDexterity(int d){
		dexterity = dexterity + d;
		points = points - d;
		return dexterity;
	}
	
	private int setIntelligence(){
		return intelligence;
	}
	
	private int setIntelligence(int i){
		intelligence = intelligence + i;
		points = points - i;
		return intelligence;
	}
	
	private int setConstitution(){
		return constitution;
	}
	
	private int setConstitution(int c){
		constitution = constitution + c;
		points = points - c;
		return constitution;
	}
	
	private int setCharisma(){
		return charisma;
	}
	
	private int setCharisma(int ch){
		charisma = charisma + ch;
		points = points - ch;
		return charisma;
	}
	
	private boolean setAll(String you, int s, int d, int i, int c, int ch){
		rolex = you;
		strength = strength + s;
		dexterity = dexterity + d;
		intelligence = intelligence + i;
		constitution = constitution + c;
		charisma = charisma + ch;
		return true;
	}
	
	public boolean checkPoints(int p){
		if(p > 10 || p < 0){
			return false;
		}
		else if(p > points){
			return false;
		}
		else if(p == 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	public void levelUp(){
		Scanner sc = new Scanner(System.in);
		loop = 0;
		
		if(level == 0){
			level = level + 1;
			points = points + 25;
		}
		else if(level > 0){
			level = level + 1;
			points = points + 10;
		}
		
		while(loop == 0){
			System.out.print("Strength(1 - 10): ");
			int st = sc.nextInt();
			loop = 1;
			if(checkPoints(st) == false){
				System.out.println("That isn't a valid input. Try again.");
				loop = 0;	
			}
			else{
				setStrength(st);
				System.out.println("You have " + points + " points left.");
			}
		}
		loop = 0;
		while(loop == 0){
			System.out.print("Dexterity(1 - 10): ");
			int de = sc.nextInt();
			loop = 1;
			if(checkPoints(de) == false){
				System.out.println("That isn't a valid input. Try again.");
				loop = 0;
			}
			else{
				setDexterity(de);
				System.out.println("You have " + points + " points left.");
			}
		}
		loop = 0;
		while(loop == 0 && points > 0){
			System.out.print("Intelligence(1 - 10): ");
			int in = sc.nextInt();
			loop = 1;
			if(checkPoints(in) == false){
				System.out.println("That isn't a valid input. Try again.");
				loop = 0;	
			}
			else{
				setIntelligence(in);
				System.out.println("You have " + points + " points left.");
			}
		}
		loop = 0;
		while(loop == 0 && points > 0){
			System.out.print("Constitution(1 - 10): ");
			int co = sc.nextInt();
			loop = 1;
			if(checkPoints(co) == false){
				System.out.println("That isn't a valid input. Try again.");
				loop = 0;	
			}
			else{
				setConstitution(co);
				System.out.println("You have " + points + " points left.");
			}
		}
		loop = 0;
		while(loop == 0 && points > 0){
			System.out.print("Charisma(1 - 10): ");
			int ch = sc.nextInt();
			loop = 1;
			if(checkPoints(ch) == false){
				System.out.println("That isn't a valid input. Try again.");
				loop = 0;	
			}
			else{
				setCharisma(ch);
			}
		}
		
		System.out.println();
		
		if(points > 1){
			System.out.println("Level up complete! You have " + points + " points leftover to spend next time.");
			System.out.println();
		}
		else if(points == 1){
			System.out.println("Level up complete! You have " + points + " point leftover to spend next time.");
			System.out.println();
		}
		else{
			System.out.println("You're out of points!");
			System.out.println();
		}
		myToString();
	}
}
