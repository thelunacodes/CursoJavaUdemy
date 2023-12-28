import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //char resp = 'n';

        //while (resp != 's') {
        //    System.out.print("Você deseja sair? (s/n): ");
        //    resp = scanner.nextLine().charAt(0);
        //}

        //Usando o do-while, não é necessário se preocupar com o valor inicial, já que o bloco de comando será executado de qualquer maneira.
        char resp;

        do {
            System.out.print("Você deseja sair? (s/n): ");
            resp = scanner.nextLine().charAt(0);
        } while (resp != 's');
    }
}