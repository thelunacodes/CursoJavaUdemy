public class Calculator {
    public static double pi = 3.14;
    public static double calculateCircuference(double r) {
        return 2 * pi * r;
    }
    public static double calculateVolume(double r) {
        return ((double) 4/3) * pi * Math.pow(r, 3.0);
    }
}
