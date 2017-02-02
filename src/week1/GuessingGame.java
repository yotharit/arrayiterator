package week1;
import java.util.Random;
/**
 * An Object collecting a method for the Guessing game
 * @author Tharit Pongsaneh
 *
 */
public class GuessingGame {

	//Declare Valuable For This Game
	private int upperBound;
	private int secret;
	private String hint;
	private int count;


	/**
	 * Initialize a new valuable for the game.
	 * @param upperBound,secret,hint,count
	 */

	GuessingGame(int upperBound){
		this.upperBound = upperBound;
		this.secret = getRandomNumber( upperBound );
		this.hint = "I'm thinking of a number between 1 and 20";
		this.count = 0;
	}

	/**
	 * Generate an object Random named 'rand' and return and int by the length from 1 to the limit.
	 * @param limit
	 * @return a random number between 1 and limit 
	 */

	private int getRandomNumber(int limit) {
		Random rand = new Random();
		return rand.nextInt( limit ) + 1;
	}

	/**
	 * This method is being use for checking either the input number is equal for the secret number or not,
	 * then using method setHint to set the hint according to the difference between guessed number
	 * and secret number
	 * @param number,hint,count
	 * @return true if your guessing is correct, else it will return false
	 */

	public boolean guess( int number ) {
		if( number==this.secret ) {
			++count;
			setHint( "Correct! The Secret Number is " + getSecretNumber() + ". You used " + getCount() + " guesses" );
			return true;
		}
		else if ( number<this.secret ) {
			setHint( "Sorry, your guess is too small" );
			count++;
			return false;
		}
		else {
			setHint( "Sorry, your guess is too big" );
			count++;
			return false;
		}
	}

	/**
	 * Return a hint based on the most recent guess
	 * @return hint based on the recent guessed
	 */

	public String getHint() {
		return hint;
	}
	
	/**
	 * Set a hint based on the input String hint
	 * @param hint
	 */
	
	protected void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Get the number of how many time u use to guess the number
	 * @return count how many time u use to guess
	 */
	public int getCount() {
		return count;
	}

	/**
	 * This method use to return upperBound values
	 * @return upperBound you set
	 */
	
	public int getUpperBound() {
		return upperBound;
	}
	
	/**
	 * This method return secret number
	 * @return secret Number
	 */
	
	public int getSecretNumber() {
		return secret;
	}
}
