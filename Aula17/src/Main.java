import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ex = 3;
        Scanner scanner = new Scanner(System.in);

        switch (ex) {
            case 1:
                //Exercício 1
                int ex1_senhaValida = 2002;
                System.out.print("Insira a senha: ");
                int ex1_senha = scanner.nextInt();

                while(ex1_senha != ex1_senhaValida) {
                    System.out.println("Senha inválida.");
                    System.out.print("Insira a senha: ");
                    ex1_senha = scanner.nextInt();
                }
                System.out.printf("Acesso permitido.");
                break;
            case 2:
                //Exercicio 2
                System.out.print("Insira uma coordenada X: ");
                int ex2_X = scanner.nextInt();
                System.out.print("Insira uma coordenada Y: ");
                int ex2_Y = scanner.nextInt();
                while (ex2_X != 0 && ex2_Y != 0) {
                    if (ex2_X > 0 && ex2_Y > 0) {
                        System.out.print("Primeiro quadrante \n");
                    } else if (ex2_X < 0 && ex2_Y > 0) {
                        System.out.print("Segundo quadrante \n");
                    } else if (ex2_X < 0 && ex2_Y < 0) {
                        System.out.print("Terceiro quadrante \n");
                    } else if (ex2_X > 0 && ex2_Y < 0) {
                        System.out.print("Quarto quadrante \n");
                    }

                    System.out.print("Insira uma coordenada X: ");
                    ex2_X = scanner.nextInt();
                    System.out.print("Insira uma coordenada Y: ");
                    ex2_Y = scanner.nextInt();
                }
                break;
            case 3:
                //Exercício 3
                int ex3_quantAlcool = 0;
                int ex3_quantGasolina = 0;
                int ex3_quantDiesel = 0;

                System.out.printf("Faça sua escolha: %n1- Álcool %n2- Gasolina %n3- Diesel %n4- Sair%n%n> ");
                int ex3_escolhaUsuario = scanner.nextInt();
                while(ex3_escolhaUsuario != 4) {
                    System.out.printf("Faça sua escolha: %n1- Álcool %n2- Gasolina %n3- Diesel %n4- Sair%n%n> ");
                    ex3_escolhaUsuario = scanner.nextInt();
                    if (ex3_escolhaUsuario == 1) {
                        System.out.println("Sua escolha: Álcool");
                        ex3_quantAlcool++;
                    } else if (ex3_escolhaUsuario == 2) {
                        System.out.println("Sua escolha: Gasolina");
                        ex3_quantGasolina++;
                    } else if (ex3_escolhaUsuario == 3) {
                        System.out.println("Sua escolha: Diesel");
                        ex3_quantDiesel++;
                    }
                }
                System.out.printf("MUITO OBRIGADO %nÁlcool: %d %nGasolina: %d %nDiesel: %d", ex3_quantAlcool, ex3_quantGasolina, ex3_quantDiesel);
                break;
            default:
                System.out.println("Exercício Inválido");
                break;
        }
    }
}