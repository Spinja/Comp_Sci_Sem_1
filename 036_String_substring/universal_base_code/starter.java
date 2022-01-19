import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		
		while(a<word.length()){
			System.out.println(word.substring(a,a+1));
			a = a + 1;
		}
		
	}
}
