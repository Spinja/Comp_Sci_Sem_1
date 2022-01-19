import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] m){
		int z = 0;
		while(z < m.length){
			System.out.println(m[z]);
			z = z + 1;
		}
	}
	
	public static int getArrayAverage(int[] n){
		int co = 0;
		int av = 0;
		while(co < n.length){
			av = av + n[co];
			co = co + 1;
		}
		av = av / n.length;
		return av;
	}
	
	public static int getArrayMax(int[] o){
		int ska = 0;
		int max = 0;
		while(ska < o.length){
			if(o[ska] > max){
				max = o[ska];
			}
			ska = ska + 1;
		}
		return max;
	}
	
	public static int getArrayMin(int[] p){
		int shsh = 0;
		int min = 1000000;
		while(shsh < p.length){
			if(p[shsh] < min){
				min = p[shsh];
			}
			shsh++;
		}
		return min;
	}
	
	public static void main(String args[]) {
		Random rand = new Random();
		int[] wow = new int[100];
		int count = 0;
		
		while(count < wow.length){
			wow[count] = rand.nextInt(100) + 1;
			count++;
		}
		
		toStringArray(wow);
		System.out.println("Average: " + getArrayAverage(wow));
		System.out.println("Maximum: " + getArrayMax(wow));
		System.out.println("Minimum: " + getArrayMin(wow));
		
	}
}
