import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dwarf[] snow = new Dwarf[100];
		Random rand = new Random();
		int c;
		int check = 0;
		
		for(c = 0; c < snow.length; c++){
			snow[c] = new Dwarf();
		}

		for(c = 0; c < snow.length; c++){
			int nam = rand.nextInt(7);
			if(nam == 0){
				snow[c].setName("Grumpy");
			}
			else if(nam == 1){
				snow[c].setName("Dopey");
			}
			else if(nam == 2){
				snow[c].setName("Doc");
			}
			else if(nam == 3){
				snow[c].setName("Happy");
			}
			else if(nam == 4){
				snow[c].setName("Bashful");
			}
			else if(nam == 5){
				snow[c].setName("Sneezy");
			}
			else{
				snow[c].setName("Sleepy");
			}
			snow[c].setAge(rand.nextInt(100));
		}
		
		for(c = 0; c < snow.length; c++){
			if(snow[0].isSameName(snow[c].name)){
				check++;
			}
		}
		
		System.out.println("The name " + snow[0].name + " was repeated " + check + " times!");
	}
}
