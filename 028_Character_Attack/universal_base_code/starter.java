import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter{
	public static void main(String args[]){
		myCharacter atk = new myCharacter("Warrior");
		atk.levelUp();
		atk.setAttackMod();
		atk.takeDamage(2);
		atk.takeDamage(10);
		atk.isDead();
	}
}