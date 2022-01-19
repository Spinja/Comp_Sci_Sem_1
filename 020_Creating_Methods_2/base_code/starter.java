import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
		int owo = 0;
		int pog = a;
		while(owo < (b - 1)){
			pog = pog * a;
			owo = owo + 1;
		}
		return pog;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your base number?");
		int first = sc.nextInt();
		
		System.out.println("What is your exponent number?");
		int second = sc.nextInt();
		
		System.out.println("Your answer is: " + pow(first, second));


		
	}
}
