import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeEstudante;
        String emailEstudante;
        int quartoEstudante;
        int numEstudantes = 0;

        ReservaQuarto[] quartos = new ReservaQuarto[10];
        do {
            System.out.print("Quantos quartos serão alugados? ");
            numEstudantes = sc.nextInt();
        } while (numEstudantes > 10 || numEstudantes < 1);

        for (int i = 0; i < numEstudantes; i++) {
            sc.nextLine();
            System.out.printf("%nAluguel #%d: %n", i+1);
            System.out.print("Nome: ");
            nomeEstudante = sc.nextLine();
            System.out.print("E-mail: ");
            emailEstudante = sc.nextLine();
            do {
               do {
                   System.out.print("Quarto (0-9): ");
                   quartoEstudante = sc.nextInt();
               } while (quartoEstudante < 0 || quartoEstudante > 9);
            } while(quartos[quartoEstudante] != null);
            quartos[quartoEstudante] = new ReservaQuarto(nomeEstudante, emailEstudante, quartoEstudante);
        }

        for (int j = 0; j < 10; j++) {
            if (quartos[j] != null) {
                System.out.printf("%nQuarto %d: %s, %s",j,quartos[j].getNome(),quartos[j].getEmail());
            }
        }

        sc.close();
    }
}