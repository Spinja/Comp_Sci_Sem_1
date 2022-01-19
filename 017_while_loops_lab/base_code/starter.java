import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		
		System.out.print("Give me a name: ");
		String name = sc.nextLine();
		
		System.out.print("How many times should the name be printed? ");
		int num = sc.nextInt();

		while(true){
			System.out.println(name);
			if(counter == num){
				break;
			}
			counter = counter + 1;
		}

		
	}
}
