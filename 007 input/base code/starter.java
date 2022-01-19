import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your first name? ");
		String name = sc.nextLine();
		
		System.out.println("How old are you? "); 
		int age = sc.nextInt();
		
		String neu = sc.nextLine();
		
		System.out.println("What month were you born in? ");
		String month = sc.nextLine();
		
		System.out.println("What number day were you born on? ");
		int day = sc.nextInt();
		
		System.out.println("What year were you born in? ");
		int year = sc.nextInt();
		
		System.out.println("How much is a buck fifty? ");
		double buck = sc.nextDouble();
		
		String neuer = sc.nextLine();
		
		System.out.println("Are you creeped out by all these personal questions? ");
		String sus = sc.nextLine();
		
		System.out.println("");
		System.out.println("Your name is " + name + ".");
		System.out.println("You are " + age + " years old.");
		System.out.println("You were born on " + month + " " + day + "," + year + ".");
		System.out.println("You think a buck fifty equals " + buck + ".");
		System.out.println("You are not creeped out by all these personal questions.");
	}
}
