import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) { 
	// get ready for player to use the keyboard
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		// play again string
			
		//game loop
			do {
		
		// create a random number 1-100
			int theNumber = (int)(Math.random()*100 + 1);
		// System.out.println ( theNumber );
			int guess = 0;
			
			while (guess != theNumber ) {
				System.out.println("Guess a number between 1 and 100");
				
		// get the user's guess
				guess = scan.nextInt();
				
				if (guess < theNumber)
					System.out.println(guess + "is too low. Try again.");
				else if(guess > theNumber)
					System.out.println(guess + " is too high. Try again.");
				else
					System.out.println(guess + "is correct! You win!"); 
			
			}// end of while loop for guessing
			
			
		// ask for 'y' to play again
				System.out.println("Would you like to play again (y/n)?");
				playAgain = scan.next();
			
			} while(playAgain.equalsIgnoreCase("y"));
			// thank the user for playing
				System.out.println("Thank you for playing! Goodbye.");
				scan.close();
	}
	
}

				

			