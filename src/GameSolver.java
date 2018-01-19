import java.util.Scanner;

/**
 * Automatically find the secret to any NumberGame.
 * 
 * @author Worawag Chueajedton
 */
public class GameSolver {
	/**
	 * Play a NumberGame and return the solution. The NumberGame object must
	 * provide messages (getMessage) containing the phrase "too small" if a
	 * guess is too small and "too large" if a guess is too large, for efficient
	 * solution.
	 *
	 * @param game
	 *            is the NumberGame to solve
	 * @return final number which gamesolver do
	 */
	public int play(NumberGame game) {
		boolean correct = false;
		int min = 1;
		int max = game.getUpperBound();
		int guessNumber = min + (max - min) / 2;
		while (!correct) {
			correct = game.guess(guessNumber);

			if (game.getMessage().contains("too small")) {
				min = guessNumber + 1;
				guessNumber = min + (max - min) / 2;

			} else if (game.getMessage().contains("too large")) {
				max = guessNumber - 1;
				guessNumber = min + (max - min) / 2;

			}

		}
		return guessNumber;
	}

}
