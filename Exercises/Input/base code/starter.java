import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		
		System.out.print("Input an integer: ");
		int put = sc.nextInt();
		
		while(counter < 5){
			System.out.println(put);
			put = put + 1;
			counter = counter + 1;
		}
	}
}
