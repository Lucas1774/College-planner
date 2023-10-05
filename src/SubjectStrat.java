public class SubjectStrat {

    public static void run() {
        double assignmentScore = 10;
        double examWeight = -1;
        while (examWeight < 0 || examWeight > 1) {
            examWeight = Utils.askForDouble("How much exam weight (between 0 and 1)?");
            if (examWeight < 0 || examWeight > 1) {
                System.out.println("Invalid input");
            }
        }
        double minExam = Utils.askForDouble("What is the minimum exam score to pass?");
        double needed = (assignmentScore * examWeight - 5) / examWeight;
        
        if (needed < minExam) {
            needed = minExam;
            assignmentScore = (5 - examWeight * needed) / (1 - examWeight);
        }
        System.out.println(String.format("%.2f", assignmentScore) + " in assignments and " + String.format("%.2f", needed) + " in exam for a score of " + String.format("%.2f", (needed * examWeight + (1 - examWeight) * assignmentScore)));
        System.out.println("0 in assignments and " + String.format("%.2f", (5 / examWeight)) + " in exam for a score of 5");
    }
}