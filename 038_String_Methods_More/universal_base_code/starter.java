import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int co = 0;
		
		System.out.println("What's your full name? (First Last)");
		String name = sc.nextLine();
		
		while(true){
			if(name.substring(co, co + 1).equals(" ")){
				co++;
				break;
			}
			co++;
		}
		
		System.out.println(name.substring(co, name.length()));
		
	}
}
