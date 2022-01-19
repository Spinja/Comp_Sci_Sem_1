import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] araara = new int[10];
		int counter = 0;
		int set = 9;
		
		while(counter < 10){
			araara[counter] = set;
			System.out.println(araara[counter]);
			counter = counter + 1;
			set = set - 1;
		}
		
	}
}
