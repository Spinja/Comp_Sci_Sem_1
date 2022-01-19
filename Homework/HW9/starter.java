import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] ara1 = new int[20];
		int[] ara2 = new int[20];
		int z = 0;
		int y = 0;
		
		while(z < ara1.length){
			ara1[z] = rand.nextInt(50) + 1;
			z++;
		}
		
		z = 0;
		
		while(z < ara1.length){
			System.out.println(ara1[z]);
			z++;
		}
		
		z = 0;
		y = ara1.length - 1;
		System.out.println("-");
		
		while(z < ara2.length){
			ara2[z] = ara1[y];
			z++;
			y--;
		}
		
		z = 0;
		
		while(z < ara2.length){
			System.out.println(ara2[z]);
			z++;
		}
		
	}
}
