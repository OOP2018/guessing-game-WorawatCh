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
 * @return final number which gamesolver do 
 */
 public int play(NumberGame game) {
	    boolean correct = false;
	    String check = "Sorry, too small.";
	    String check2 = "Sorry, too large.";
	    int constant = 2;
	    int fiftyConstant = 50;
		int guessNumber = game.getUpperBound()/2;
		while(!correct){
			System.out.println(guessNumber);
			correct = game.guess(guessNumber);
		    if(game.getMessage()==check){
			     guessNumber=guessNumber+fiftyConstant/(constant);
			}
			else if(game.getMessage()==check2){
			     guessNumber=guessNumber-fiftyConstant/(constant);
			}
		    constant=constant*2;
		}
		return guessNumber;
	}
	
 }
