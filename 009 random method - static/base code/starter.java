import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random randy = new Random();
		int rand_num1 = randy.nextInt(10);
		int rand_num2 = randy.nextInt(10) + 1;
		double rand_num3 = randy.nextDouble() + 2.5;
		int dub = randy.nextInt(575) + 14;
		double rand_num4 = randy.nextDouble() + dub;
		System.out.println("A number between 0 - 9: " + rand_num1);
		System.out.println("A number between 1 - 10: " + rand_num2);
		System.out.println("A number between 2.5 and 3.5: " + rand_num3);
		System.out.println("A double between 14 and 589: " + rand_num4);
	}
}
