package pkg;
import java.util.Scanner;
import java.util.Random;


public class APLine {
	private double a = 1;
	private double b = 1;
	private double c = 1;
	private double slope;
	
	public APLine(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getSlope(){
		slope = (-a)/b;
		return slope;
	}
	
	public boolean isOnLine(double x, double y){
		double d = x;
		double e = y;
		double line = (a*d) + (b*e) + c;
		if(line == 0){
			return true;
		}
		else{
			return false;
		}
	}

}
