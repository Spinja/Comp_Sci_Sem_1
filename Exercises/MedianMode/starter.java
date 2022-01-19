import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getMode(int[] array){
		int repeats = 0;
		int prev = 0;
		int mode = 0;
		if(array.length > 0){
			for(int co = 0; co < array.length; co++){
				for(int a = 0; a < array.length; a++){
					if(array[co] == array[a]){
						repeats++;
					}
				}
				if(repeats > prev){
					mode = array[co];
				}
				prev = repeats;
				repeats = 0;
			}
			return mode;
		}
		return -1;
	}
	
	public static int getMedian(int[] array){
		if(array.length < 1){
			return -1;
		}
		int[] ar = new int[array.length];
		int small = 1000;
		int smallnum = 0;
		for(int az = 0; az < array.length; az++){
			for(int a = 0; a < array.length; a++){
				if(array[a] < small){
					small = array[a];
					smallnum = a;
				}
			}
			array[smallnum] = 1000;
			ar[az] = small;
			small = 1000;
		}
		
		return ar[ar.length/2];
	}
	
	public static void main(String args[]) {
		int[] b = {2,5,8,3,7,5,3,7,5};
		System.out.println(getMode(b) + "\n" + getMedian(b));


		
	}
}
