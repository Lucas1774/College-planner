/**
 * Console program to help you approach a subject or a test of it.
 */
public class CollegeStrat {

    public static void main(String[] args) {
        String again = "y";
        while (!again.equals("n")) {
            int ans = (int) Utils.askForDouble(
                    "What program do you want to run?\n" + "1 - Subject calculator.\n" + "2 - Test calculator.");
            switch (ans) {
                case 1:
                    SubjectStrat.run();
                    break;
                case 2:
                    ExamStrat.run();
                    break;
                default:
                    System.out.println("Invalid input.");
                    continue;
            }
            again = Utils.askForString("Again? [Y/n]");
        }
    }
}
