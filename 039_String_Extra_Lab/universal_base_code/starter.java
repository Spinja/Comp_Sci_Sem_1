import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String after = new String();
		String indi = new String();
		int counter = 0;
		int co = 0;
		int count2 = 0;

		System.out.println("Write a phrase!");
		String phrase = sc.nextLine();
		int leg = phrase.length();
		co = leg;
		
		System.out.println("Before: " + phrase);
		
		while(count2 < phrase.length()){
			for(int l = 0; l < leg; l++){
				if(phrase.substring(co - 1, co).equals(" ")){
					indi = indi + " ";
					l = leg + 1;
				}
				else{
					indi = phrase.substring(co - 1, co) + indi;
				}
				co--;
				counter++;
				count2++;
			}
			leg = leg - counter;
			counter = 0;
			after = after + indi;
			indi = "";
		}
		
		System.out.println("After: " + after);
		
	}
}
