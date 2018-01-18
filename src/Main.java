/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 2;
		NumberGame game = new WorawatGame(upperBound);
		GameConsole ui = new GameConsole( );
		GameSolver ai = new GameSolver();
		//int solution = ui.play( game );
		int aiSolution = ai.play( game );
		int amount = game.getCount();
		//TODO display the answer returned by play
		//System.out.println("play() returned "+solution);
		//TODO display how many guesses the user made
		System.out.println("Amount of your guess "+ amount);
		System.out.println("Ai said the secret number is "+aiSolution);
		
	}
}
