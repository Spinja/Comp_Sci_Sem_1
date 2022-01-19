package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public int mad;
	public int last;
	
	public int abs(int a) {
		if(a < 0){
			a = a * (-1);
		}
		return a;
	}
	
	public int max(int b, int c) {
		if(b > c){
			return b;
		}
		else if(c > b){
			return c;
		}
		else{
			return b;
		}
	}
	
	public int min(int d, int e) {
		if(d < e){
			return d;
		}
		if(e < d){
			return e;
		}
		else{
			return d;
		}
	}
	
	public double pow(double f, double g) {
		double counter = 1.0;
		double f2 = f;
		while(counter != g){
			f = f * f2;
			counter = counter + 1.0;
		}
		return f;
	}
	
	public double sqrt(int h) {
		double t;  
		double sqrtroot = h / 2;  
		do {  
			t = sqrtroot;  
			sqrtroot = (t + (h/t)) / 2;  
		}   
		while((t - sqrtroot) != 0);  
			return sqrtroot;  
	}
	
	public double avg(int i, int j) {
		double av = (i + j) / 2.0;
		return av;
	}
	
	public void SimpleRandom(int mad){
		this.mad = mad;
		last = (int) (System.currentTimeMillis() % mad);
	}
	
	public int random(int k) {
		SimpleRandom(k);
		last = (last * 32719 + 3) % k;
		return last % mad;
	}

}
