package week1;
import java.util.Scanner;
/**
 * Console for the game
 * @author tharitpongsaneh
 *
 */
public class GameConsole {
	/**
	 * Object for the console of Guessing game
	 * @param game
	 */
	public void play(GuessingGame game){
		Scanner scan = new Scanner(System.in);
		System.out.println("Guessing Game");
		boolean guessing = false;
		while(guessing==false){
		System.out.print("Your guess? ");
		int number = scan.nextInt();
		guessing = game.guess(number);
		System.out.println(game.getHint());
		}
	}
}
