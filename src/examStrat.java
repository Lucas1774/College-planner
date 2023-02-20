import java.lang.Math;
import java.util.Scanner;

public class examStrat {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String args[]){
        while (true){
            int questions = (int)askForDouble("How many questions?");
            double goal = askForDouble("What score do you aim for?");
            double scorePerHit = askForDouble("How much for each correct answer?");
            double scorePerMiss = askForDouble("How much less for each wrong answer?");
            int miss = 0;

            for (int hit = (int)Math.ceil(goal / scorePerHit); hit <= questions - miss; hit ++){
                miss = (int)Math.floor((hit * scorePerHit - goal) / scorePerMiss);
                if (miss + hit > questions ){
                    miss = questions - hit;
                }
                if (miss != (int)Math.floor(((hit - 1) * scorePerHit - goal) / scorePerMiss)){
                    System.out.println( hit + " correct and " + miss + " wrong out of "
                    + (hit + miss) + " giving a score of " + (hit * scorePerHit - miss * scorePerMiss));
                }
            }
        }
    }
    private static double askForDouble(String string) {
        System.out.println(string);
        return scanner.nextDouble();
    }
}