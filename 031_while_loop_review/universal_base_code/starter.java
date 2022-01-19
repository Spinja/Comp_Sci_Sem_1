import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int count = 0;
		
		while(count < 100){
			System.out.println(rand.nextInt(100) + 1);
			count = count + 1;
		}
		
	}
}
