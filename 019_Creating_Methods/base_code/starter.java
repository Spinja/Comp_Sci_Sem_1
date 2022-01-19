import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String a){
		System.out.println(a);
		return;
	}
	
	public static void toStringCombined(String a, String b){
		System.out.print(a);
		System.out.println(" " + b);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a sentence!");
		String first = sc.nextLine();
		System.out.println();
		
		System.out.println("Write another sentence!");
		String second = sc.nextLine();
		System.out.println();

		System.out.println("This is using the methods!");
		toString(first);
		toStringCombined(first, second);
	}
}
