public class quiz {
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

    public quiz(){
        qNum = (int)(Math.random()*5 + 1);
        numCorr = 0;
        q1 = "What is the value of -9?";
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
        q1 = "What is the value of -9?";
        q2 = "If the English alphabet goes from A - Z, what goes from Z - A?";
        q3 = "Who won the space race?";
        q4 = "Whats the square root of 36?";
        a1 = Integer.toString(Math.abs(-9));
        a2 = "Zebra";
        a3 = "USA";
        a4 = Integer.toString((int)Math.sqrt(36));
    }





}
