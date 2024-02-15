import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String nome = "";
        double salario = 0;

        System.out.print("Quantos funcionários serão lidos? ");
        int quantFuncionarios = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < quantFuncionarios; i++) {
            System.out.printf("%nFuncionario #%d: %n", i+1);
            do {
                System.out.print("Id: ");
                id = sc.nextInt();
            } while (idExiste(funcionarios, id));
            sc.nextLine();
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Salário: ");
            salario = sc.nextDouble();
            funcionarios.add(new Funcionario(id, nome, salario));
        }
        System.out.print("\nInsira o id do funcionário que receberá o aumento: ");
        int idAumento = sc.nextInt();
        Funcionario funcAumento = funcionarios.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);

        if (funcAumento != null) {
            System.out.print("Insira a porcentagem do aumento de salário: ");
            double porcAumento = sc.nextDouble();
            funcAumento.aumentoSalario(porcAumento);
        } else {
            System.out.println("Id inválido.");
        }
        System.out.println("\nLista de funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
        sc.close();
    }
    public static boolean idExiste(List<Funcionario> funcionarios, int id) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}