/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 99;
		NumberGame game = new WorawatGame(upperBound);
		GameConsole ui = new GameConsole( );
		GameSolver ai = new GameSolver();
		//int solution = ui.play( game );
		int aiSolution = ai.play( game );
		int amount = game.getCount();
		//System.out.println("play() returned "+solution);
		System.out.println("Amount of your guess "+ amount);
		System.out.println("GameSolver said the secret number is "+aiSolution);
		
	}
}
