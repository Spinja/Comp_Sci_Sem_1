import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int points = 25;
		int tohi = 0;
		int out = 0;
		int strength = 0;
		int dex = 0;
		int intel = 0;
		int points2 = 0;
		int cons = 0;
		int chari = 0;
		int norole = 0;
		
		System.out.println("What is your name, hero?");
		String name = sc.nextLine();
		
		System.out.println("What is your title? (EX: Slayer of Dragons)");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		
		if(role.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else if(role.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("That is not a role. Rerun the program.");
			norole = 1;
		}
		
		if(norole == 0){
			System.out.println();
			System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
			System.out.println();
			
			System.out.println("Strength (1 - 10): ");
			strength = sc.nextInt();
			if(strength > 10){
				System.out.println("That's too high! Start over.");
				tohi = 2;
			}
			else{
				points = points - strength;
				System.out.println("You have " + points + " points left.");
				System.out.println();
		
				System.out.println("Dexterity ( 1 - 10): ");
				dex = sc.nextInt();
				if(dex > 10){
					System.out.println("That's too high! Start over.");
					tohi = 2;
				}
				else{
					points = points - dex;
					System.out.println("You have " + points + " points left.");
					System.out.println();
			
					System.out.println("Intelligence ( 1 - 10): ");
					intel = sc.nextInt();
					points = points - intel;
					if(intel > 10){
						System.out.println("That's too high! Start over.");
						tohi = 2;
					}
					else if(points <= 0){
						System.out.println("You're out of points!");
						out = 1;
						points2 = points;
					}
					else{
						System.out.println("You have " + points + " points left.");
						System.out.println();
		
						System.out.println("Constitution ( 1 - 10): ");
						cons = sc.nextInt();
						points = points - cons;
						if(cons > 10){
							System.out.println("That's too high! Start over.");
							tohi = 2;
						}
						else if(points <= 0){
							System.out.println("You're out of points!");
							out = 2;
							points2 = points;
						}
						else{
							System.out.println("You have " + points + " points left.");
							System.out.println();
		
							System.out.println("Charisma ( 1 - 10): ");
							chari = sc.nextInt();
							points2 = points;
							points = points - chari;
							if(chari > 10){
								System.out.println("That's too high! Start over.");
								tohi = 2;
							}
							else if(points <= 0){
								System.out.println("You're out of points!");
								out = 3;
							}
							else{
								System.out.println();
								if(points > 0){
									System.out.println("You have " + points + " points to spend for next time.");
									System.out.println();
								}
							}
						}
					}
				}
			}
			
			if(tohi == 0){
				if(out == 1){
					intel = intel + points2;
					cons = 0;
					chari = 0;
				}
				else if(out == 2){
					cons = cons + points2;
					chari = 0;
				}
				else if(out == 3){
					chari = points2;
				}
				System.out.println("---------------------------------------------------------");
				System.out.println("You are " + name + ", the " + title + " of CVHS.");
				System.out.println("You're a " + role + " with the following stats!");
				System.out.println();
				System.out.println("Strength - " + strength);
				System.out.println("Dexterity - " + dex);
				System.out.println("Intelligence - " + intel);
				System.out.println("Constitution - " + cons);
				System.out.println("Charisma - " + chari);
				
				System.out.println();
				System.out.println("Good luck on your quest " + name + "!");
			}
		}
		
	}
}
