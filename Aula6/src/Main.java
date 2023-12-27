import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Qual é o seu nome? \n> ");
        //String nome = scanner.nextLine();
        //System.out.print("Qual é o seu sobrenome? \n> ");
        //String sobrenome = scanner.nextLine();
        //System.out.print("Qual é a sua idade? \n> ");
        //int idade = scanner.nextInt();
        //System.out.print("Qual é a sua altura? \n> ");
        //double altura = scanner.nextDouble();
        //System.out.print("Qual é o seu sexo? (Insira \"m\" ou \"f\")\n> ");
        //char sexo = scanner.next().charAt(0);

        //System.out.printf("Seu nome é %s %s, sua idade é %d, sua altura é %.2f e seu sexo é %s", nome, sobrenome, idade, altura, sexo);
        int x;
        String s1, s2, s3;

        x = scanner.nextInt();
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        scanner.close();
    }
}