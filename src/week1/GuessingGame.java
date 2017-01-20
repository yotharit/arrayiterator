package week1;
import java.util.Random;
/**
 * Game of Guessing a secret number
 * @author tharitpongsaneh
 *
 */
public class GuessingGame {
	
	//Declare Valuable For This Game
	private int upperBound;
	private int secret;
	private String hint;
	private int count;
	
	
	/**
	 * Initialize a new game.
	 * @param upperbound is the max value for the secret number (>1).
	 */
	GuessingGame(int upperbound){
		this.upperBound = upperbound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and 20";
		this.count = 0;
	}
	/**
	 * Create a random number between 1 and limit.
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
	   Random rand = new Random();
	   return rand.nextInt(limit) + 1;
	}
	/**
	 * Guess method
	 * @param number,hint,count
	 * @return true if your guessing is correct, else it will return false
	 */
	public boolean guess(int number){
		if(number==this.secret) {
			++count;
			setHint("Correct. You used "+getCount()+" guesses");
			return true;
		}
		else if(number<this.secret){
			setHint("Sorry, your guess is too small");
			count++;
			return false;
		}
		else{
			setHint("Sorry, your guess is too big");
			count++;
			return false;
		}
	}
	/**
	 * Return a hint based on the most recent guess
	 * @return hint based on most recent guess
	 */
	public String getHint() {
		return hint;
	}
	/**
	 * set Hint
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
}
