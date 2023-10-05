import java.lang.Math;

public class ExamStrat {

    public static void run() {
        int questions = (int) Utils.askForDouble("How many questions?");
        double goal = Utils.askForDouble("What score do you aim for?");
        double scorePerHit = Utils.askForDouble("How much for each correct answer?");
        double scorePerMiss = Utils.askForDouble("How much less for each wrong answer?");
        int miss = 0;

        for (int hit = (int) Math.ceil(goal / scorePerHit); hit <= questions - miss; hit++) {
            miss = (int) Math.floor((hit * scorePerHit - goal) / scorePerMiss);
            if (miss + hit > questions) {
                miss = questions - hit;
            }
            if (miss != (int) Math.floor(((hit - 1) * scorePerHit - goal) / scorePerMiss)) {
                System.out.println(hit + " correct and " + miss + " wrong out of " + (hit + miss) + " giving a score of " + String.format("%.2f", (hit * scorePerHit - miss * scorePerMiss)));
            }
        }
    }
}