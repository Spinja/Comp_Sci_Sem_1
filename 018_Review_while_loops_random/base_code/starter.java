import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Random rando = new Random();
		int run = rando.nextInt(1000) + 1;
		
		while(true) {
			System.out.print("Guess a number between 1 and 1000: ");
			int num = sc.nextInt();
		
			if(num == run){
				System.out.println("You guessed it!");
				break;
			}
			else if(num < run){
				System.out.println("You're too low!");
			}
			else if(num > run){
				System.out.println("You're too high!");
			}
			else{
				System.out.println("huh");
			}
			
		}
		
	}
}
