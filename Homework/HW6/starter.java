import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public boolean checkPrime(int a){
		int x = a;
		int co = 2;
		boolean y = false;
		if(x == 2){
			y = true;
			return y;
		}
		while(co < x){
			if(x % co != 0){
				y = true;
			}
			else{
				y = false;
				break;
			}
			co = co + 1;
		}
		
		return y;
	}
	
	public void printPrimes(int b){
		int w = b;
		int count = 2;
		while(count < w){
			if(checkPrime(count) == true){
				System.out.println(count);
			}
			count = count + 1;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		starter s = new starter();
		
		System.out.println("Input an integer: ");
		int in = sc.nextInt();
		
		System.out.println();
		System.out.println("Primes: ");
		s.printPrimes(in);
		
	}
}
