import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean byThree(int a, int b){
		int c = a;
		int d = b;
		int e = c * d;
		if(e % 3 == 0){
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two integers.");
		int f = sc.nextInt();
		int g = sc.nextInt();
		
		System.out.println(byThree(f,g));
		
	}
}
