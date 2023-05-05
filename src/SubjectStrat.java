public class SubjectStrat {
    public static void run(){
        double assignmentScore = 10;
        double examWeight = Utils.askForDouble("How much exam weight (between 0 and 1)?");
        double minExam = Utils.askForDouble("What is the minimum exam score to pass?");
        double needed = (assignmentScore * examWeight - 5) / examWeight;
        
        if (needed < minExam){
            needed = minExam;
            assignmentScore = (5 - examWeight * needed) / (1 - examWeight);
        }
        System.out.println( assignmentScore + " in assignments and " + needed + " in exam for a score of " + (needed * examWeight + (1 - examWeight) * assignmentScore));
    }
}