import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Random rando = new Random();
		int run = rando.nextInt(1000) + 1;
		
		System.out.print("Pick a number between 1 and 1000: ");
		int num = sc.nextInt();
		
		if(num == run){
			System.out.println("You got it! The number was " + run + "!");
		}
		else if(num < run){
			System.out.println("You guessed too low. The number was " + run + ".");
		}
		else if(num > run){
			System.out.println("You guessed too high. The number was " + run + ".");
		}
		else{
			System.out.println("huh");
		}
	}
}
