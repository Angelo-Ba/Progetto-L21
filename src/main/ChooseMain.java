/**
 * 
 */
package main;
/**
 * To choose the main which starts the program
 * 
 * @author Team - L21
 *
 */
public class ChooseMain {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		switch (args[0].trim().toLowerCase()) {
		case "shell":
			new MainConsole().main(null);
			break;
		case "app":
			new MainApp().main(null);
			break;
		default:
			System.out.println(args[0] + " :not recognized as a command");
		}
	}

}
