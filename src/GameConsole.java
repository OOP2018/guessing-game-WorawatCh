import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		game.toString();
	    System.out.println( game.toString() );
		System.out.println( game.getMessage() );
		boolean correct = false;
		int guess = 0;
		while(!correct){
			System.out.print("Your answer? ");
			 guess = console.nextInt();
		    correct = game.guess(guess);
			System.out.println( game.getMessage() );
		}
		return guess;
	}
	
}
