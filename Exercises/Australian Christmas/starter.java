class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		String risk = new String("*");
		String space = new String(" ");
		
		System.out.println("*******");
		System.out.println(" ***** ");
		System.out.println("  ***  ");
		System.out.println("   *   ");
		
		System.out.println(risk + risk + risk + risk + risk + risk + risk);
		System.out.println(space + risk + risk + risk + risk + risk + space);
		System.out.println(space + space + risk + risk + risk + space + space);
		System.out.println(space + space + space + risk + space + space + space);
	}
}
