import java.util.Scanner;

/**
 * IO utils service.
 */
public class Utils {

    /**
     * @param question - question to ask user
     * @return - input as a double. If not a double it will prompt the user again
     */
    public static double askForDouble(String question) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.println(question);
                    return Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
        }
    }

    /**
     * 
     * @param question - question to ask user
     * @return - user input. If not n the program will restart
     */
    public static String askForString(String question) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(question);
            return scanner.nextLine();
        }
    }
}