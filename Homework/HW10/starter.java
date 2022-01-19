import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();

		int[] elements = new int[20];
		int c = 0;
		int target = rand.nextInt(10) + 1;
		int dup = 0;
		int cons = 0;
		
		for(c=0; c<elements.length; c++){
			elements[c] = rand.nextInt(10) + 1;
		}
		
		for(c=0; c<elements.length; c++){
			if(elements[c] == target){
				dup = dup + 1;
				System.out.println("[" + c + "] is a duplicate of the target number.");
			}
		}
		
		System.out.println("The target number was " + target + ". It had " + dup + " duplicates.");
		
		cons = elements[0];
		
		for(c=1; c<elements.length; c++){
			if(elements[c] == cons){
				System.out.println("[" + (c - 1) + "] and [" + c + "] are the same number, " + elements[c] + "!");
			}
			cons = elements[c];
		}
		
	}
}
