import java.util.Scanner;

/**
 * Automatically find the secret to any NumberGame.
 */
public class GameSolver {
 /**
 * Play a NumberGame and return the solution.
 * The NumberGame object must provide messages (getMessage)
 * containing the phrase "too small" if a guess is too small
 * and "too large" if a guess is too large, for efficient
 * solution.
 *
 * @param game is the NumberGame to solve
 * @return //TODO what does it return?
 */
 public int play(NumberGame game) {
	    boolean correct = false;
		int guessNumber = 0;
		int upperBound = game.getUpperBound();
		while(!correct){
			guessNumber = upperBound/2;
			if(guessNumber==upperBound) correct=game.guess(guessNumber);
			else if(guessNumber<upperBound){
				 correct=game.guess(guessNumber+guessNumber/2);
			} else if(guessNumber>upperBound){
				 correct=game.guess(guessNumber-guessNumber/2);
			}
		}
		return guessNumber;
	}
	
 }
