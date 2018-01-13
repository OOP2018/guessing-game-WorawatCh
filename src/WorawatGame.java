import java.util.Random; // for generating random numbers

/**
 * Game of guessing a secret number. Form 1 to 100 you have to guess what secret number is
 * 
 * @author Worawat Chueajedton
 */
public class WorawatGame extends NumberGame {
	//the largest number that the game can be//
	private int upperBound;
	//the solution of the game//
	private int secret;
	//integer that count how many time which player play 
	private int count;

	public WorawatGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomnumber(upperBound);
		setMessage("I'm thinking of a number between 1 and 100");
	}
	
	/**
	 * Check a player's answer.
	 * @param number is player's answer
	 * @return true if the answer is correct, if not return false
	 * 
	 */

	public boolean guess(int number) {
		count++;
		if (number == secret) {
			setMessage("Right! The secret number is " + secret);
			return true;
		} else if (number < secret) {
			setMessage("Sorry, too small.");
		} else if (number > secret) {
			setMessage("Sorry, too large.");
		}
		return false;
	}
	
	/**
	 * Random a secret number which player must try to guess 
	 * @param upperBound a largest number that random number can be
	 * @return random number
	 */
	
	public int getRandomnumber(int upperBound){
		long seed = System.nanoTime( );
		Random rand = new Random( seed );
		// get a random number between 0 and 9. Add 1 so the value is 1 - 10.
		int value = rand.nextInt(100) + 1;
		return value;
	}

	/**
	 * Get the upper bound.
	 * @return upper bound
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * Explain what game is.
	 * @return description of game
	 */
	public String toString() {
		return "Try to guess a number.";
	}
	
	/**
	 * Get a number of how many time player take
	 * @return number of how many time player take
	 */
	public int getCount(){
		return count;
	}
}