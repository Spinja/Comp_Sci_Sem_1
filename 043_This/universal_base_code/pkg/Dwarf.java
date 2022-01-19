package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	public String name = new String();
	int age = 0;

	public Dwarf() {
		name = "";
		age = 0;
	}
	
	public Dwarf(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean isSameName(String name){
		if(this.name.equals(name)){
			return true;
		}
		else{
			return false;
		}
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

