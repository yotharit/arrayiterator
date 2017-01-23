package week1;
import java.util.Scanner;
/**
 * Object created to be Console for the GuessingGame, and get the guessed number as an input
 * @author Tharit Pongsaneh
 *
 */
public class GameConsole {
	/**
	 * This method print title and looping the command for input guessed number and print hint
	 * @param game
	 */
	public void play ( GuessingGame game ) {
		Scanner scan = new Scanner( System.in );
		System.out.println( "Guessing Game" );
		System.out.println( "I'm thinking of a number between 1 and " + game.getUpperBound() );
		boolean guessing = false;
		while( guessing == false ) {
			System.out.print( "Your guess? " );
			int number = scan.nextInt();
			guessing = game.guess( number );
			System.out.println( game.getHint() );
		}
	}
}
