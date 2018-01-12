import java.util.Random; // for generating random numbers

/**
 * Game of guessing a secret number. -- write a description
 * 
 * @author Worawat Chueajedton
 */
public class WorawatGame extends NumberGame {
	/* properties of a guessing game */
	private int upperBound;
	private int secret;
	private int count;

	public WorawatGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomnumber(upperBound);
		setMessage("I'm thinking of a number between 1 and 100");
	}

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
	
	public int getRandomnumber(int upperBound){
		long seed = System.nanoTime( );
		Random rand = new Random( seed );
		// get a random number between 0 and 9. Add 1 so the value is 1 - 10.
		int value = rand.nextInt(10) + 1;
		return value;
	}

	public int getUpperBound() {
		return upperBound;
	}

	public String toString() {
		return "Try to guess a number.";
	}
	
	public int getCount(){
		return count;
	}
}