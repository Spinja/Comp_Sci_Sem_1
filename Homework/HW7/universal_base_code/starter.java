import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dog{
	String name = new String();
	int age = 0;
	String breed = new String();
	
	public Dog(){
		name = "Clifford";
		age = 3;
		breed = "Big Red Dog";
	}
	
	public Dog(String a){
		name = a;
		age = 1;
		breed = "Dog Dog";
	}
	
	public Dog(String a, String b){
		name = a;
		age = 1;
		breed = b;
	}
	
	public Dog(String a, int c){
		name = a;
		age = c;
		breed = "Dog Dog";
	}
	
	public void setName(String a){
		name = a;
	}
	
	public void setAge(int c){
		age = c;
	}
	
	public void setBreed(String b){
		breed = b;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		Random rand = new Random();
		int waosdf = rand.nextInt(100) + 1;
		if(waosdf <= 50){
			return false;
		}
		return true;
	}
	
	public void bark(){
		Random rand = new Random();
		System.out.print(name + ": ");
		int ldkf = rand.nextInt(5) + 1;
		int ssd = rand.nextInt(100) + 1;
		if(ldkf == 1 && ssd == 42){
			System.out.println("Greetings Mortal.");
		}
		else if(ldkf == 1){
			System.out.println("bark");
		}
		else if(ldkf == 2){
			System.out.println("bork");
		}
		else if(ldkf == 3){
			System.out.println("bowow");
		}
		else if(ldkf == 4){
			System.out.println("ruff");
		}
		else if(ldkf == 5){
			System.out.println("barck");
		}
		else{
			System.out.println("360 degree poggers noscope");
		}
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog Rockruff = new Dog();
		Rockruff = new Dog("Lycanroc");
		Rockruff.setAge(232948736);
		
		Dog Growlithe = new Dog();
		Growlithe = new Dog("Arcanine", "the Legendary Pokemon");
		
		boolean zzz = Rockruff.isSleeping();
		boolean Zzzz = Growlithe.isSleeping();
		
		
		if(zzz){
			System.out.println(Rockruff.getName() + " is asleep!");
		}
		else{
			Rockruff.bark();
		}
		
		if(Zzzz && !zzz){
			Growlithe.bark();
		}
		else if(!Zzzz && !zzz){
			Growlithe.bark();
		}
		
	}
}
