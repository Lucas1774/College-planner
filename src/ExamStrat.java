import java.lang.Math;

/**
 * Service to run a test exam optimizer.
 */
public class ExamStrat {

    /**
     * Runs the Exam program, which returns minimum scenarios to pass given the
     * amount of questions, a score goal, the weight of correct answers and the
     * negative weight of incorrect answers.
     */
    public static void run() {
        int questions = (int) Utils.askForDouble("How many questions?");
        double goal = Utils.askForDouble("What score do you aim for?");
        double scorePerHit = Utils.askForDouble("How much for each correct answer?");
        double scorePerMiss = Utils.askForDouble("How much less for each wrong answer?");
        int miss = 0;
        for (int hit = (int) Math.ceil(goal / scorePerHit); hit <= questions - miss; hit++) {
            miss = (int) Math.floor(Math.round((hit * scorePerHit - goal) / scorePerMiss));
            if (miss + hit > questions) {
                miss = questions - hit;
            }
            if (miss != (int) Math.floor(Math.round(((hit - 1) * scorePerHit - goal) / scorePerMiss))) {                System.out.println(hit + " correct and " + miss + " wrong out of " + (hit + miss)
                        + " giving a score of " + String.format("%.2f", (hit * scorePerHit - miss * scorePerMiss)));
            }
        }
    }
}