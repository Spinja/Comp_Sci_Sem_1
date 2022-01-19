package pkg;
import java.util.Scanner;
import java.util.Random;


public class Druid implements Role{
	Random rand = new Random();
	String name;
	int health;
	int attack;

	public Druid() {
		name = "Oak";
		health = 20;
		attack = 20;
	}
	
	public Druid(String name){
		this.name = name;
		health = 20;
		attack = 20;
	}
	
	public void setHealth(int h){
		health = h;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Warrior i){
		int dmg = rand.nextInt(attack) + 1;
		int hwe = i.getHealth();
		i.setHealth(hwe - dmg);
	}
	
	public void attack(Wizard j){
		int dmg = rand.nextInt(attack) + 1;
		int hwe = j.getHealth();
		j.setHealth(hwe - dmg);
	}
	
	public void printArt(){
		System.out.println(" __");
		System.out.println("(");
		System.out.println("&|");
		System.out.println(" |&");
	}

}

