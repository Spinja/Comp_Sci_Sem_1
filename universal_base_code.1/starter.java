import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void printArray(int[] a){
		for(int count = 0; count < a.length; count++){
			System.out.println(a[count]);
		}
	}
	
	public static String cookie(String b){
		Random rand = new Random();
		int x = rand.nextInt(16) + 1;
		int c2 = 0;
		String d = b;
		String a = "";
		for(int c = 0; c < d.length(); c++){
			a = a + b.substring(c,c+1);
			if(b.substring(c,c+1).equals(" ")){
				c2++;
			}
			if(x > 5 && c2 == 2){
				a = a + "chocolate chip ";
				c2++;
			}
			else if(c2 == 2){
				a = a + "raisin ";
				c2++;
			}
		}
		return a;
	}
	
	public static void main(String args[]) {
		System.out.println(cookie("I like cookies!"));
	}
}
