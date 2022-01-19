import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input one integer: ");
		int erste = sc.nextInt();
		
		System.out.println("Input another integer: ");
		int zweite = sc.nextInt();
		
		if(erste%2 == 0){
			System.out.println("The first number is even.");
		}
		else{
			System.out.println("The first number is odd.");
		}
		
		if(zweite%2 == 0){
			System.out.println("The second number is even.");
		}
		else{
			System.out.println("The second number is odd.");
		}
		
		if(erste%2 == 0){
			if(zweite%2 != 0){
				System.out.println("The first number is divisible by 2, but the second number is not.");
			}
			else{
				System.out.println("Both the first and second numbers are divisible by 2.");
			}
		}
		else if(zweite%2 == 0){
			System.out.println("The second number is divisible by 2, but the first is not.");
		}
		else{
			System.out.println("Neither number is divisible by 2.");
		}
		
		if(erste%4 == 0){
			if(zweite%4 != 0){
				System.out.println("The first number is divisible by 4, but the second is not.");
			}
			else{
				System.out.println("Both the first and second numbers are divisible by 4.");
			}
		}
		else if(zweite%4 == 0){
			System.out.println("The second number is divisible by 4, but the first is not.");
		}
		else{
			System.out.println("Neither number is divisible by 4.");
		}
		
		if(erste%5 == 0){
			if(zweite%5 != 0){
				System.out.println("The first number is divisible by 5, but the second is not.");
			}
			else{
				System.out.println("Both the first and second numbers are divisible by 5.");
			}
		}
		else if(zweite%5 == 0){
			System.out.println("The second number is divisible by 5, but the first is not.");
		}
		else{
			System.out.println("Neither number is divisible by 5.");
		}
	}
}
