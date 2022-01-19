import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		
		for(int a = 0; a < word.length(); a++){
			System.out.println(word.substring(a,a + 1));
		}
		
	}
}
