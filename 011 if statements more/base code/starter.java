import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input your first number: ");
		int one = sc.nextInt();
		
		System.out.print("Input you second number: ");
		int two = sc.nextInt();
		
		if(one == two){
			System.out.println("Your numbers are the same!");
		}
		else{
			System.out.println("Your numbers are different.");
		}
	}
}
