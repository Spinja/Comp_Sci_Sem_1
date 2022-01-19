import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] rands = new int[1000];
		int[] powers = new int[1000];
		double[] squares = new double[1000];
		int count = 0;
		
		while(count != 1000){
			rands[count] = test.random(1000);
			count = count + 1;
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		
		count = 0;
		
		while(count != 1000){
			powers[count] = test.pow(rands[count], rands[count + 1]);
			squares[count] = test.sqrt(rands[count]);
			count = count + 1;
		}
		
		count = 0;
		int veg = 0;
		int er = 0;
		int av = 0;
		
		while(count < 1000){
			veg = test.avg(powers[count], powers[count + 1]);
			if(count > 0){
				av = test.avg(veg, er);
			}
			er = veg;
			count = count + 2;
		}
		
		count = 0;
		
		/*while(count < 1000){
			veg = test.avg(powers[count], powers[count + 1]);
			if(count > 0){
				av = test.avg(veg, er);
			}
			er = veg;
			count = count + 2;
		*/}
		
	}
}
