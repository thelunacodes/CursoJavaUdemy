public class Student {
    public String name;
    public double score1, score2, score3;

    public double getSum() {
        return score1 + score2 + score3;
    }
    public void isApproved() {
        if (getSum() >= 60.00) {
            System.out.println("PASS");
        } else {
            System.out.printf("FAILED %nMISSING %.2f POINTS", 60.00 - getSum());
        }
    }
}
