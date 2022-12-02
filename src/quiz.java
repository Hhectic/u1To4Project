import java.util.Scanner;
/*The quiz class represents a quiz. A quiz is represented with questions, user answers, the actual answers, number of questions, and
number of questions answered correctly
 */
public class quiz {
    Scanner answers = new Scanner(System.in);

    private String userA;
    private int qNum;
    private int numCorr;
    private String q1;
    private String q2;
    private String q3;
    private String q4;
    private String a1;
    private String a2;
    private String a3;
    private String a4;

    /*Constructor for the quiz class. This creates a new instance of a quiz given no parameters

     */
    public quiz(){
        qNum = (int)(Math.random()*5 + 1);
        numCorr = 0;
        q1 = "What is the absolute value of -9?";
        q2 = "If the English alphabet goes from A - Z, what goes from Z - A?";
        q3 = "Who won the space race?";
        q4 = "Whats the square root of 36?";
        a1 = Integer.toString(Math.abs(-9));
        a2 = "Zebra";
        a3 = "USA";
        a4 = Integer.toString((int)Math.sqrt(36));
    }
    public quiz(int qNum){
        this.qNum = qNum;
        numCorr = 0;
        q1 = "What is the absolute value of -9?";
        q2 = "If the English alphabet goes from A - Z, what goes from Z - A?";
        q3 = "Who won the space race?";
        q4 = "Whats the square root of 36?";
        a1 = Integer.toString(Math.abs(-9));
        a2 = "Zebra";
        a3 = "USA";
        a4 = Integer.toString((int)Math.sqrt(36));
    }

    public boolean correct1(String userA){
        this.userA = userA;
        if(userA.toLowerCase().equals(a1.toLowerCase())){
            return true;
        }
        return false;
    }
    public boolean correct2(String userA){
        this.userA = userA;
        if(userA.toLowerCase().equals(a2.toLowerCase())){
            return true;
        }
        return false;
    }
    public boolean correct3(String userA){
        this.userA = userA;
        if(userA.toLowerCase().equals(a3.toLowerCase())){
            return true;
        }
        return false;
    }
    public boolean correct4(String userA){
        this.userA = userA;
        if(userA.toLowerCase().equals(a4.toLowerCase())){
            return true;
        }
        return false;
    }

    public void qAndA(){
        for (int i = 1; i <= qNum; i++){
            if(i==1){
                System.out.println(q1);
                userA = answers.nextLine();
                if(correct1(userA) == true){
                    numCorr++;
                } else {
                    System.out.println("Wrong");
                }
            }
            if(i==2){
                System.out.println(q2);
                userA = answers.nextLine();
                if(correct2(userA) == true){
                    numCorr++;
                } else {
                    System.out.println("Wrong");
                }
            }
            if(i==3){
                System.out.println(q3);
                userA = answers.nextLine();
                if(correct3(userA) == true){
                    numCorr++;
                } else {
                    System.out.println("Wrong");
                }
            }
            if(i==4){
                System.out.println(q4);
                userA = answers.nextLine();
                if( userA.equals("-6") || correct4(userA) == true ){
                    numCorr++;
                } else {
                    System.out.println("Wrong");
                }
            }


        }
        if (numCorr <= qNum/2){
            System.out.println("You only  " + numCorr + " out of " + qNum + ", you can do better, want to try again?");
        } else if (numCorr == qNum || numCorr == qNum - 1){
            System.out.println("You got  " + numCorr + " out of " + qNum + " correct, you did great!");
        } else {
            System.out.println("You got" + numCorr + " out of " + qNum + " correct, you did ok!");
        }
    }

    public String toString()
    {
        String returnString = "Answer key: " + "\n" +  "question 1 answer is " + a1 + "\n" + "question 2 answer is " + a2 + "\n" + "question 3 answer is " + a3 + "\n" + "question 4 answer is " + a4 + " or -6";

        return returnString;
    }





}
