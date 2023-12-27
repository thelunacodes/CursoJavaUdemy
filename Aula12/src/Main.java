import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exercicio = 8;
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        switch (exercicio) {
            case 1:
                //Exercício 1
                System.out.print("Insira um número inteiro: ");
                int ex1_num = scanner.nextInt();
                if (ex1_num >= 0) {
                    System.out.println("O número é positivo");
                } else {
                    System.out.println("O número é negativo");
                }
                break;
            case 2:
                //Exercício 2
                System.out.print("Insira um número inteiro: ");
                int ex2_num = scanner.nextInt();
                if (ex2_num % 2 == 0) {
                    System.out.println("O número é par");
                } else {
                    System.out.println("O número é impar");
                }
                break;
            case 3:
                //Exercício 3
                System.out.print("Digite o primeiro número: ");
                int ex3_n1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int ex3_n2 = scanner.nextInt();

                if (ex3_n1 > ex3_n2) {
                    if (ex3_n1 % ex3_n2 == 0) {
                        System.out.println("São múltiplos");
                    } else {
                        System.out.println("Não são múltiplos");
                    }
                } else {
                    if (ex3_n2 % ex3_n1 == 0) {
                        System.out.println("São múltiplos");
                    } else {
                        System.out.println("Não são múltiplos");
                    }
                }
                break;
            case 4:
                //Exercício 4
                int duracao;
                System.out.print("Insira a hora inicial: ");
                int ex4_horaInicial = scanner.nextInt();
                System.out.print("Insira a hora final: ");
                int ex4_horaFinal = scanner.nextInt();
                if (ex4_horaInicial < ex4_horaFinal) {
                    duracao = ex4_horaFinal - ex4_horaInicial;
                } else {
                    duracao = 24 - ex4_horaInicial + ex4_horaFinal;
                }
                System.out.printf("O jogo durou %d horas.", duracao);
                break;
            case 5:
                //Exercício 5
                double ex5_total;
                double ex5_precoHotDog = 4.00;
                double ex5_precoXSalada = 4.50;
                double ex5_precoXBacon = 5.00;
                double ex5_precoTorradaSimples = 2.00;
                double ex5_precoRefri = 1.50;

                System.out.print("Insira o código do produto: ");
                int ex5_codigoProduto = scanner.nextInt();
                System.out.print("Insira a quantidade do produto: ");
                int ex5_quantProduto = scanner.nextInt();

                if (ex5_codigoProduto == 1) {
                    ex5_total = ex5_precoHotDog * ex5_quantProduto;
                    System.out.printf("Total: R$ %.2f", ex5_total);
                } else if (ex5_codigoProduto == 2) {
                    ex5_total = ex5_precoXSalada * ex5_quantProduto;
                    System.out.printf("Total: R$ %.2f", ex5_total);
                } else if (ex5_codigoProduto == 3) {
                    ex5_total = ex5_precoXBacon * ex5_quantProduto;
                    System.out.printf("Total: R$ %.2f", ex5_total);
                } else if (ex5_codigoProduto == 4) {
                    ex5_total = ex5_precoTorradaSimples * ex5_quantProduto;
                    System.out.printf("Total: R$ %.2f", ex5_total);
                } else if (ex5_codigoProduto == 5) {
                    ex5_total = ex5_precoRefri * ex5_quantProduto;
                    System.out.printf("Total: R$ %.2f", ex5_total);
                } else {
                    System.out.print("O código de produto que você inseriu não existe.");
                }
                break;
            case 6:
                //Exercício 6
                System.out.print("Insira um número qualquer: ");
                double ex6_num = scanner.nextDouble();
                if (ex6_num >= 0 && ex6_num <= 25) {
                    System.out.println("Intervalo 0 - 25");
                } else if (ex6_num > 25 && ex6_num <= 50) {
                    System.out.println("Intervalo 25 - 50");
                } else if (ex6_num > 50 && ex6_num <= 75) {
                    System.out.println("Intervalo 50 - 75");
                } else if (ex6_num > 75 && ex6_num <= 100) {
                    System.out.println("Intervalo 75 - 100");
                } else {
                    System.out.println("Fora do intervalo");
                }
                break;
            case 7:
                //Exercício 7
                System.out.print("Insira o valor de x: ");
                double ex7_valX = scanner.nextDouble();
                System.out.print("Insira o valor de y: ");
                double ex7_valY = scanner.nextDouble();

                if (ex7_valX == 0 && ex7_valY == 0) {
                    System.out.println("Origem");
                } else if ((ex7_valX == 0 && ex7_valY != 0)) {
                    System.out.println("Eixo X");
                } else if ((ex7_valX != 0 && ex7_valY == 0)) {
                    System.out.println("Eixo Y");
                } else if (ex7_valX > 0 && ex7_valY > 0) {
                    System.out.println("Primeiro quadrante");
                } else if (ex7_valX < 0 && ex7_valY > 0) {
                    System.out.println("Segundo quadrante");
                } else if (ex7_valX < 0 && ex7_valY < 0) {
                    System.out.println("Terceiro quadrante");
                } else if (ex7_valX > 0 && ex7_valY < 0) {
                    System.out.println("Quarto quadrante");
                }

                break;
            case 8:
                //Exercício 8
                double ex8_imposto = 0;
                System.out.print("Insira o seu salário: ");
                double ex8_salario = scanner.nextDouble();
                if (ex8_salario <= 2000.00) {
                    ex8_imposto = 0;
                } else if (ex8_salario <= 3000.00) {
                    ex8_imposto = (ex8_salario - 2000.0) * 0.08;
                } else if (ex8_salario <= 4500.00) {
                    ex8_imposto = (ex8_salario - 3000.0) * 0.18 + 1000.0 * 0.08;
                } else if (ex8_salario > 4500.00) {
                    ex8_imposto = (ex8_salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
                }

                if (ex8_imposto == 0) {
                    System.out.println("Isento");
                } else {
                    System.out.printf("Imposto: R$ %.2f", ex8_imposto);
                }
                break;
            default:
                System.out.println("Exercício inválido");
                break;
        }
    }
}