package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	Scanner sc = new Scanner(System.in);
	int example = 0;
	public String rolex = new String();
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	public int remaining = 25;
	public int toohi = 2;

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
	
	public int setStrength(){
		return strength;
	}
	
	public int setStrength(int s){
		if(s <= 10){
			strength = s;
			remaining = remaining - s;
			System.out.println("You have " + remaining + " points left.");
			toohi = toohi + 1;
		}
		else{
			System.out.println("That's too high! Try again.");
		}
		return strength;
	}
	
	public int setDexterity(){
		return dexterity;
	}
	
	public int setDexterity(int d){
		if(d <= 10){
			dexterity = d;
			remaining = remaining - d;
			System.out.println("You have " + remaining + " points left.");
			toohi = toohi + 1;
		}
		else{
			System.out.println("That's too high! Try again.");
		}
		return dexterity;
	}
	
	public int setIntelligence(){
		return intelligence;
	}
	
	public int setIntelligence(int i){
		if(i > remaining){
			System.out.println("You don't have enough points for that! Try again.");
		}
		else if(i <= 10){
			intelligence = i;
			remaining = remaining - i;
			System.out.println("You have " + remaining + " points left.");
			toohi = toohi + 1;
		}
		else{
			System.out.println("That's too high! Try again.");
		}
		return intelligence;
	}
	
	public int setConstitution(){
		return constitution;
	}
	
	public int setConstitution(int c){
		if(c > remaining){
			System.out.println("You don't have enough points for that! Try again.");
		}
		else if(c <= 10){
			constitution = c;
			remaining = remaining - c;
			System.out.println("You have " + remaining + " points left.");
			toohi = toohi + 1;
		}
		else{
			System.out.println("That's too high! Try again.");
		}
		return constitution;
	}
	
	public int setCharisma(){
		return charisma;
	}
	
	public int setCharisma(int ch){
		if(ch > remaining){
			System.out.println("You don't have enough points for that! Try again.");
		}
		else if(ch <= 10){
			charisma = ch;
			remaining = remaining - ch;
			System.out.println("You have " + remaining + " points left.");
			toohi = toohi + 1;
		}
		else{
			System.out.println("That's too high! Try again.");
		}
		return charisma;
	}
	
	public boolean setAll(String you, int s, int d, int i, int c, int ch){
		rolex = you;
		strength = s;
		dexterity = d;
		intelligence = i;
		constitution = c;
		charisma = ch;
		return true;
	}
}

