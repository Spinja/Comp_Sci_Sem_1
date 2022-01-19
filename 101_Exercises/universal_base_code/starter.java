import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Ascii asdf = new Ascii();
		
		asdf.printArt();
		
		asdf = new Ascii("Dog", "Pebble Estab Miyato III");
		
		asdf.printArt();
		
		asdf = new Ascii("Cactus", 21);
		
		asdf.printArt();
		
		asdf = new Ascii("Other", "Skitz", 3);
		
		asdf.setAscii("(=ÒwÓ= )_/");
		
		asdf.printArt();
		
		asdf = new Ascii("cat");
		
		asdf.printArt();
		
	}
}
