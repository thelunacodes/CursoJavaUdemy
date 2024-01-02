import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Triângulo X
        System.out.print("Insira o lado A do triângulo X: ");
        int ladoAX = scanner.nextInt();
        System.out.print("Insira o lado B do triângulo X: ");
        int ladoBX = scanner.nextInt();
        System.out.print("Insira o lado C do triângulo X: ");
        int ladoCX = scanner.nextInt();

        //Triângulo Y
        System.out.print("Insira o lado A do triângulo Y: ");
        int ladoAY = scanner.nextInt();
        System.out.print("Insira o lado B do triângulo Y: ");
        int ladoBY = scanner.nextInt();
        System.out.print("Insira o lado C do triângulo Y: ");
        int ladoCY = scanner.nextInt();

        //Área triângulo X
        double valPX = ((double) ladoAX + ladoBX + ladoCX) / 2;
        double areaX = Math.sqrt(valPX * (valPX - ladoAX) * (valPX - ladoBX) * (valPX - ladoCX));
        System.out.printf("Área do triângulo X = %.2f UM² %n", areaX);

        //Área triângulo Y
        double valPY = ((double) ladoAY + ladoBY + ladoCY) / 2;
        double areaY = Math.sqrt(valPY * (valPY - ladoAY) * (valPY - ladoBY) * (valPY - ladoCY));
        System.out.printf("Área do triângulo Y = %.2f UM² %n", areaY);

        //Maior área
        System.out.printf("A maior área é: %.2f UM²", Math.max(areaX, areaY));
    }
}