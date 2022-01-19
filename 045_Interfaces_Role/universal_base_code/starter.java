import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Role[] dboi = new Role[3];
		dboi[0] = new Wizard();
		dboi[1] = new Warrior();
		dboi[2] = new Druid();
		
		System.out.println(dboi[0].getName());
		dboi[0].printArt();
		System.out.println(dboi[1].getName());
		dboi[1].printArt();
		System.out.println(dboi[2].getName());
		dboi[2].printArt();
	}
}
