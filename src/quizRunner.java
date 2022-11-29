import java.util.Scanner;
public class quizRunner {
    public static void main(String[]args) {
        Scanner qNumb = new Scanner(System.in);
        System.out.println("How many questions do you want to answer out of 4?" + "\n" + " Type R for a random amount of questions");
        String questionNum = qNumb.nextLine();
        quiz q1 = new quiz();
        if (!questionNum.equals("R")) {
            int q = Integer.parseInt(questionNum);
            q1 = new quiz(q);
        }
        q1.qAndA();

        System.out.println("Would you like the answer key for all four questions? Type yes if you do");
        String ua = qNumb.nextLine();
        if (ua.equals("yes")) {
            System.out.println(q1);
        }

    }
}
