public class Main {
    public static void main(String[] args) {
        double raizQuadrada = Math.sqrt(25);
        System.out.println(raizQuadrada);
        double potencia = Math.pow(2,5);
        System.out.println(potencia);
        double abs = Math.abs(-255);
        System.out.println(abs);

        int a = 4;
        int b = 2;
        int c = -6;
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("delta = %.2f%n", delta);
        System.out.printf("x1 = %.2f%n", x1);
        System.out.printf("x2 = %.2f%n", x2);
    }
}