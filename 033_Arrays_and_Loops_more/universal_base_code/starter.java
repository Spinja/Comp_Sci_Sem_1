import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int co = 0;
		int min = 1000;
		int max = 0;
		int av = 0;
		int[] ar = new int[rand.nextInt(150) + 51];

		while(co < ar.length){
			ar[co] = rand.nextInt(100) + 1;
			co = co + 1;
		}
		
		co = 0;
		
		while(co < ar.length){
			if(ar[co] < min){
				min = ar[co];
			}
			co = co + 1;
		}
		
		co = 0;
		
		while(co < ar.length){
			if(ar[co] > max){
				max = ar[co];
			}
			co = co + 1;
		}
		
		co = 0;
		
		while(co < ar.length){
			av = av + ar[co];
			co = co + 1;
		}
		
		av = av / ar.length;
		
		System.out.println("There were " + ar.length + " elements.");
		System.out.println("The minimum was " + min);
		System.out.println("The maximum was " + max);
		System.out.println("The average was " + av);
		
	}
}
