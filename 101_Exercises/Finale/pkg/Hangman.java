package pkg;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
	String guessingWord;
	int numTries;

	public Hangman() {
		generateWord();
		numTries = 5;
	}
	
	public Hangman(int a){
		generateWord();
		numTries = a;
	}
	
	public int guessFirst(String b, int c){
		for(int x = 0; x < guessingWord.length; x++){
			if(b.equals(guessingWord.substring(x, x+1))){
				return x;
			}
		}
		return -1;
	}
	
	public boolean checkWin(boolean[] d){
		int count = 0;
		for(int x = 0; x < d.length; x++){
			if(d[x] == true){
				count++;
			}
		}
		if(count == d.length){
			return true;
		}
		return false;
	}

}

