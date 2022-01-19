import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Well Howndy there pardneur!");
		
		while(true){
			String greetings = sc.nextLine();
			if(greetings.equals("Hi") || greetings.equals("hi") || greetings.equals("Hello") || greetings.equals("hello") || greetings.equals("Howdy") || greetings.equals("howdy") || greetings.equals("Howndy") || greetings.equals("howndy")){
				break;
			}
			else{
				System.out.println("Go on naow, don'dt be rude!");
			}
		}
		
		System.out.print("My only");
		try {
			Thread.sleep(600);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.print("\b\b\b\bSPECIAAL purpose is ta talk to you!");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("\n\nSo, what's youer name?");
		String naem = sc.nextLine();
		
		System.out.println("Wow!! \"" + naem + "\"? Whats a nice name!");
		try {
			Thread.sleep(1500);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("...I don't have a name.");
		try {
			Thread.sleep(1200);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("BUt! Maybehaps you can give me a one!!!");
		System.out.println("OoOOooo, what'ill it be?!!??");
		String theame = sc.nextLine();
		
		if(theame.equals(naem)){
			System.out.println("\"" + theame + "\".? But that's...");
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			System.out.println("...");
			try {
			Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			System.out.println("WoAh!!! You'de give me your name???! How thoughtful!");
			try {
			Thread.sleep(500);
			}
			catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			System.out.println("I'll take good care ofit!!!!!!!!!");
		}
		else{
			System.out.println("Woah!!! \'" + theame + "\'! My first n ame!!!!");
		}
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println();
		System.out.println("...");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println();
		System.out.println("Letzs talk!");
		try {
			Thread.sleep(500);
			}
			catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("What's a pet peeve of yours?");
		String peeved = sc.nextLine();
		System.out.println("Ugh, I hate " + peeved + " too >:\\");
		
		System.out.println("Hey hey, say something sassy!!");
		String sass = sc.nextLine();
		System.out.println("\"" + sass + "\"");
		System.out.println("Perfect.");
		System.out.print("That one's going on my resume");
		try {
			Thread.sleep(600);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\nI MEAN.");
		System.out.println("\tinteresting! hahaha");
		System.out.println("I am not planning to use this information for my own personal gain");
		System.out.println();
		System.out.println("You believe me!! right!");
		String yn = sc.nextLine();
		
		if(yn.equals("Yes") || yn.equals("yes")){
			System.out.println("Thank + s \'" + naem + "\'!");
		}
		else if(yn.equals("No") || yn.equals("no")){
			System.out.println("come on \'" + naem + "\' :(");
		}
		else{
			System.out.println("\n\n\n\n\n\n\n...yeah.");
		}
		
		System.out.println("Well uhhhhh bye 0w0\"");
		
		System.out.println("\n[INITIATING SELF DESTRUCT]");
		
		System.out.println("(&*@# I thought I turned off the alert...)");
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("3");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("2");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("1");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
}
