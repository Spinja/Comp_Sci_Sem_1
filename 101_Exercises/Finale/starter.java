import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getMode(int[] a){
		if(a.length > 0){
			int c = 0;
			int count = 0;
			int n = 0;
			for(int y = 0; y < a.length; y++){
				for(int x = 0; x < a.length; x++){
					if(a[c] == a[x]){
						count++;
						n = c; //this doesn't work :C
					}
				}
				c++;
			}
			return a[n];
		}
		return -1;
	}
	
	public static int getMedian(int[] b){
		if(a.length > 0){
			int count = 0;
			count = b.length / 2;
			return b[count];
		}
		return -1;
	}
	
	public static void main(String args[]) {


		
	}
}
