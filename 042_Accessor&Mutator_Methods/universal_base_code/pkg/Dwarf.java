package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	String name = new String();
	int age = 0;

	public Dwarf() {
		name = "";
		age = 0;
	}
	
	public void setName(String a){
		name = a;
	}
	
	public void setAge(int b){
		age = b;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

}

