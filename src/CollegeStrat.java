public class CollegeStrat {
    public static void main(String[] args) {
        while (true){
            int ans = (int) Utils.askForDouble("What program do you want to run?\n" + "1 - Subject calculator.\n" + "2 - Test calculator.");
            switch (ans) {
                case 1:
                    SubjectStrat.run();
                    break;
                case 2:
                    ExamStrat.run();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}
