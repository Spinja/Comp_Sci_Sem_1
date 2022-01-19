package pkg;
import java.util.Scanner;
import java.util.Random;


public class NumberCube {
	Random rand = new Random();
	int count = 0;
	
	public int toss() {
	int num = rand.nextInt(6) + 1;
	return num;
	count ++;
	}
	
	public static int[] getCubeTosses(NumberCube cube, int numTosses){
		int count = numTosses;
		while(numTosses > 0){
			toss();
			numTosses --;
		}
	}

}
