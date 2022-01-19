import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class starter {
	static boolean round = true;
	static int bank = 100;
	static int roll1;
	static int roll2;
	static int roll3;
	static int neg = 1;
	static int wag = 0;
	static int what = 10;
	
	public static void SlotMachine(){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while(round){
			while(neg == 1){
				what = 10;
				System.out.print("Wager: $");
				wag = sc.nextInt();
				sc.nextLine();
				neg = 2;
				System.out.println();
				if(wag < 0){
					System.out.println("You can't wager negative numbers >:(");
					neg = 1;
				}
				else if(wag > bank){
					System.out.println("You don't have enough money to wager that!");
					neg = 1;
				}
				else if(wag == 0){
					System.out.println("You're wagering... nothing?\n...ok then.");
				}
			}
			
			roll1 = rand.nextInt(10) + 1;
			roll2 = rand.nextInt(10) + 1;
			roll3 = rand.nextInt(10) + 1;
			
			System.out.println("Your rolls are:");
			System.out.println("_______________________");
			System.out.println("  | " + roll1 + " | " + roll2 + " | " + roll3 + " |");
			System.out.println("_______________________");
			
			if(roll1 == roll2 && roll1 == roll3){
				wag = wag * 2;
				bank = bank + wag;
				System.out.println("JACKPOT!");
			}
			else if(roll1 == roll2 || roll1 == roll3 || roll2 == roll3){
				bank = bank + wag;
				System.out.println("You won!");
			}
			else{
				bank = bank - wag;
				System.out.println("You lost!");
			}
			
			if(bank <= 0){
				System.out.println("You're out of money :(\nCome back soon!");
				round = false;
			}
			else if(round = true){
				System.out.println("You have $" + bank + ".");
				
				while(what == 10){
					System.out.print("Do you want to continue? ");
					String yn = sc.nextLine();
					
					if(yn.equals("No") || yn.equals("no") || yn.equals("N") || yn.equals("n") || yn.equals("Nope") || yn.equals("nope")){
						round = false;
						what = 11;
						System.out.println("Okay. See you next time!");
					}
					else if(yn.equals("Yes") || yn.equals("yes") || yn.equals("y") || yn.equals("Y") || yn.equals("Yeah") || yn.equals("yeah") || yn.equals("Yep") || yn.equals("yep")){
						what = 11;
					}
					else{
						System.out.println("Sorry, I don't understand.");
					}
					neg = 1;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		while(what == 10){
			System.out.print("Would you like the rules? ");
			String rule = sc.nextLine();
		
			if(rule.equals("Yes") || rule.equals("yes") || rule.equals("y") || rule.equals("Y") || rule.equals("sure") || rule.equals("Sure") || rule.equals("what") || rule.equals("What") || rule.equals("Heck yeah!") || rule.equals("Heck yeah") || rule.equals("heck yeah") || rule.equals("Yeah") || rule.equals("yeah") || rule.equals("Ok") || rule.equals("ok") || rule.equals("YES")){
				System.out.println("Weeeelcome to the Super Slot Machine 5000000000000 (five trillion)!");
				try {
					Thread.sleep(3000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("Here we give you the experience of a crippling gambling addiction!");
				try {
					Thread.sleep(3000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("Simulated. Of course.");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("");
				System.out.println("You start with $100! 100 smackeroons! Wow!");
				try {
					Thread.sleep(3000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("Each round you'll be asked for a wager. (We only accept cash in integers sry)");
				try {
					Thread.sleep(3000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("If you roll 2 of the same numbers, your wager will be doubled.");
				try {
					Thread.sleep(4000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("If all three numbers are the same, your wager will be tripled!");
				try {
					Thread.sleep(4000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("But be careful...");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("If you run out of money, the game ends! Wuh oh!");
				try {
					Thread.sleep(3000);
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println();
				System.out.println("Let's begin!");
				what = 11;
			}
			else if(rule.equals("No") || rule.equals("no") || rule.equals("N") || rule.equals("n") || rule.equals("Nope") || rule.equals("nope")){
				what = 11;
			}
			else{
				System.out.println("Sorry, I don't understand.");
			}
		}
		
		SlotMachine();
		
		/*while(round){
			while(neg == 1){
				what = 10;
				System.out.print("Wager: $");
				wag = sc.nextInt();
				sc.nextLine();
				neg = 2;
				System.out.println();
				if(wag < 0){
					System.out.println("You can't wager negative numbers >:(");
					neg = 1;
				}
				else if(wag > bank){
					System.out.println("You don't have enough money to wager that!");
					neg = 1;
				}
				else if(wag == 0){
					System.out.println("You're wagering... nothing?\n...ok then.");
				}
			}
			
			roll1 = rand.nextInt(10) + 1;
			roll2 = rand.nextInt(10) + 1;
			roll3 = rand.nextInt(10) + 1;
			
			System.out.println("Your rolls are:");
			System.out.println("_______________________");
			System.out.println("  | " + roll1 + " | " + roll2 + " | " + roll3 + " |");
			System.out.println("_______________________");
			
			if(roll1 == roll2 && roll1 == roll3){
				wag = wag * 2;
				bank = bank + wag;
				System.out.println("JACKPOT!");
			}
			else if(roll1 == roll2 || roll1 == roll3 || roll2 == roll3){
				bank = bank + wag;
				System.out.println("You won!");
			}
			else{
				bank = bank - wag;
				System.out.println("You lost!");
			}
			
			if(bank <= 0){
				System.out.println("You're out of money :(\nCome back soon!");
				round = false;
			}
			else if(round = true){
				System.out.println("You have $" + bank + ".");
				
				while(what == 10){
					System.out.print("Do you want to continue? ");
					String yn = sc.nextLine();
					
					if(yn.equals("No") || yn.equals("no") || yn.equals("N") || yn.equals("n") || yn.equals("Nope") || yn.equals("nope")){
						round = false;
						what = 11;
						System.out.println("Okay. See you next time!");
					}
					else if(yn.equals("Yes") || yn.equals("yes") || yn.equals("y") || yn.equals("Y") || yn.equals("Yeah") || yn.equals("yeah") || yn.equals("Yep") || yn.equals("yep")){
						what = 11;
					}
					else{
						System.out.println("Sorry, I don't understand.");
					}
					neg = 1;
				}
			}
		}*/
		
	}
}
