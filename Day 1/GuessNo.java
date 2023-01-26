import java.util.Random;
import java.util.Scanner;

public class GuessNo {
	public static void main(String[] args) {
		
		// Objective : Generate Random Number
		// Package : java.util
		// Method : nextInt(limit) : generates andom between 0 to limit
		
		Scanner scn = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
		System.out.println("Guess the number between 0 and 20");
		int userChoice = scn.nextInt();
		Random rnd = new Random();
		int computerChoice = rnd.nextInt(20);
		System.out.println("Computer Choice : "+computerChoice);
		
		if(userChoice > computerChoice) {
			System.out.println("Your guess is too high");
		} else if(userChoice < computerChoice) {
			System.out.println("Your guess is too low");
		} else {
			System.out.println("Gotcha! You guessed it right");
			break;
		}
		}
		

	}
}
