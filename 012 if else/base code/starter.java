import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("Is is raining today? ");
		//String rain = sc.nextLine();
		
		/*if(rain == "yes"){
			System.out.print("Don't forget your umbrella!");
		}
		if(rain == "no"){
			System.out.print("Make sure to bring sunscreen!");
		}*/
		
		Random rando = new Random();
		int run = rando.nextInt(1000) + 1;
		
		System.out.print("Pick a number between 1 and 1000: ");
		int num = sc.nextInt();
		
		if(num == run){
			System.out.println("You got it! The number was " + run + "!");
		}
		else{
			System.out.println("Sorry, that wasn't the random number. The number was " + run + ".");
		}
	}
}
