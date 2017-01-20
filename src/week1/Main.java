package week1;
/**
 * Main method use to generate Object GuessingGame and GameConsole, and starting the program
 * @author Tharit Pongsaneh
 */
public class Main {
	
	public static void main(String[]args){
		GuessingGame game = new GuessingGame (20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
