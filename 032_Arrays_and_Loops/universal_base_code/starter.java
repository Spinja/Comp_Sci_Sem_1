import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int cou = 0;
		int[] arar = new int[1000];
		
		while(cou < arar.length){
			arar[cou] = rand.nextInt(100) + 1;
			cou = cou + 1;
		}
		
		cou = 0;
		
		while(cou < arar.length){
			System.out.println(arar[cou]);
			cou = cou + 1;
		}
		
	}
}
