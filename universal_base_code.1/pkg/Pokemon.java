package pkg;
import java.util.Scanner;
import java.util.Random;


public class Pokemon {
	String water;
	String fire;
	String grass;
	int which = 0;
	public Pokemon(String water, String fire, String grass){
		this.water = water;
		this.fire = fire;
		this.grass = grass;
	}
	public void starterPick(){
		while(true){
			System.out.println("Professor Tree: \"Which starter will you choose?\"");
			System.out.println("[" + water + "]\t[" + fire + "]\t[" + grass + "]");
			if(which == 1){
				System.out.println(water + " is the most defensive!");
				break;
			}
			if(which == 2){
				System.out.println(fire + " is the most offensive!");
				break;
			}
			if(which == 3){
				System.out.println(grass + " is the most useless!");
				break;
			}
			else{
				System.out.println("\"Please pick one of these starters!\"");
			}
		}
	}
	public void Choice(String a){
		if(a.equals(water)){
			which = 1;
		}
		else if(a.equals(fire)){
			which = 2;
		}
		else if(a.equals(grass)){
			which = 3;
		}
		else{
			which = 0;
		}
	}

}
