import java.util.Scanner;

public class Utils {
    private static Scanner scanner = new Scanner(System.in);
    public static double askForDouble(String q) {
        System.out.println(q);
        return scanner.nextDouble();
    }
}
