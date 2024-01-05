import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;
        int numConta;
        String nomeTitular;
        double saldoInicial;

        char escolha;
        double valDeposito;
        double valSaque;

        //Criação de conta
        System.out.print("Insira o número da conta: ");
        numConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Insira o nome do titular: ");
        nomeTitular = sc.nextLine();
        do {
            System.out.print("Haverá um depósito inicial? (\"s\" ou \"n\"): ");
            escolha = sc.next().toLowerCase().charAt(0);
        } while (!(escolha == 'n' || escolha == 's'));
        if (escolha == 's') {
            System.out.print("Insira o saldo inicial: ");
            saldoInicial = sc.nextDouble();
            conta = new Conta(numConta, nomeTitular, saldoInicial);
        } else {
            conta = new Conta(numConta, nomeTitular);
        }
        System.out.println("\nSua conta foi criada com sucesso!");
        System.out.println("\n" + conta);

        //Depósito
        System.out.print("\nInsira o valor do depósito: ");
        valDeposito = sc.nextDouble();
        conta.depositoDinheiro(valDeposito);

        System.out.println("\nO depósito foi feito com sucesso!");
        System.out.println("\n" + conta);

        //Saque
        System.out.print("\nInsira o valor do saque: ");
        valSaque = sc.nextDouble();
        conta.saqueDinheiro(valSaque);

        System.out.println("\nO saque foi feito com sucesso!");
        System.out.println("\n" + conta);

        sc.close();
    }
}