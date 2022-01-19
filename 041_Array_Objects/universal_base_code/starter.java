import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Warrior[] war = new Warrior[100];
		Wizard[] wiz = new Wizard[100];
		int e = 0;
		int f = 0;
		int wi = 0;
		boolean wahaha = true;
		
		for(e = 0; e < war.length; e++){
			war[e] = new Warrior("Wario " + (e + 1));
			wiz[e] = new Wizard("Waluigi " + (e + 1));
		}
		
		e = 0;
		
		while(wahaha){
			wiz[e].attack(war[f]);
			if(!war[f].isDead()){
				war[f].attack(wiz[e]);
			}
			else if(f != 99){
				f++;
				war[f].attack(wiz[e]);
			}
			if(wiz[e].isDead() && e != 99){
				e++;
			}
			if(war[99].isDead()){
				System.out.println("Wizards won!");
				while(e < wiz.length){
					wi++;
					e++;
				}
				System.out.println(wi + " wizards remain.");
				wahaha = false;
			}
			else if(wiz[99].isDead()){
				System.out.println("Warriors won!");
				while(f < war.length){
					wi++;
					f++;
				}
				System.out.println(wi + " warriors remain.");
				wahaha = false;
			}
		}
		
	}
}
