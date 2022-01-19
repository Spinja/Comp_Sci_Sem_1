import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String[] ara = new String[10];
		int counter = 0;
		
		ara[0] = "We got a";
		ara[1] = "number one Victory Royale";
		ara[2] = "Yeah Fortnite we bout to get down";
		ara[3] = "(get down)";
		ara[4] = "Ten kills on the board right now";
		ara[5] = "Just took out Tomato Town";
		ara[6] = "My friend just got downed";
		ara[7] = "I revived him now we're heading South bound";
		ara[8] = "Now we're in the Pleasant Park streets";
		ara[9] = "Look at the map go to the marked sheet";
		
		while(counter < 10){
			System.out.println(ara[counter]);
			counter = counter + 1;
		}
		
	}
}
