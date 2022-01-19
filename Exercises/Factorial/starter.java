import java.util.Scanner;

class starter {
	public static int fact(int a){
		int x = a;
		int y = x;
		while(y>1){
			x = x * (y - 1);
			y = y - 1;
			System.out.println(x);
		}
		return x;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number:");
		int x = sc.nextInt();
		int answer = fact(x);
	}
}
