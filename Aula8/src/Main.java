import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int exercicio = 6;

        switch (exercicio) {
            case 1:
                //Exercício 1
                System.out.print("Insira o primeiro número: \n> ");
                int ex1_n1 = scanner.nextInt();
                System.out.print("Insira o segundo número: \n> ");
                int ex1_n2 = scanner.nextInt();
                System.out.printf("Soma: %d", ex1_n1 + ex1_n2);
                break;
            case 2:
                //Exercício 2
                System.out.printf("Insira o raio da circuferência: %n> ");
                double ex2_raio = scanner.nextDouble();
                double ex2_pi = 3.14159;
                double area = ex2_pi * Math.pow(ex2_raio, 2);
                System.out.printf("A área de uma circuferência de %f UM tem um ex2_raio de %.4f UM", ex2_raio, area);
                break;
            case 3:
                //Exercício 3
                System.out.printf("Insira o primeiro número: %n> ");
                int ex3_valA = scanner.nextInt();
                System.out.printf("Insira o segundo número: %n> ");
                int ex3_valB = scanner.nextInt();
                System.out.printf("Insira o terceiro número: %n> ");
                int ex3_valC = scanner.nextInt();
                System.out.printf("Insira o quarto número: %n> ");
                int ex3_valD = scanner.nextInt();
                int diferenca = ex3_valA * ex3_valB - ex3_valC * ex3_valD;
                System.out.printf("Diferença: %d", diferenca);
                break;
            case 4:
                //Exercício 4
                System.out.printf("Insira o número do funcionário: %n> ");
                int ex4_numFuncionario = scanner.nextInt();
                System.out.printf("Insira o seu número de horas trabalhadas: %n> ");
                double ex4_numHorasTrabalhadas = scanner.nextDouble();
                System.out.printf("Insira o pagamento recebido por hora: %n> ");
                double ex4_pagamentoPorHora = scanner.nextDouble();
                System.out.printf("Numero = %d %nSalário: R$ %.2f", ex4_numFuncionario, (ex4_pagamentoPorHora * ex4_numHorasTrabalhadas));
                break;
            case 5:
                //Exercício 5
                System.out.println("=======================\n\t\tITEM #1\n=======================");
                System.out.printf("Insira o id do item 1: %n> ");
                int ex5_idItem1 = scanner.nextInt();
                System.out.printf("Insira a quantidade do item 1: %n> ");
                int ex5_quantItem1 = scanner.nextInt();
                System.out.printf("Insira o valor de cada unidade do item 1: %n> ");
                double ex5_valItem1 = scanner.nextDouble();
                System.out.println("=======================\n\t\tITEM #2\n=======================");
                System.out.printf("Insira o id do item 2: %n> ");
                int ex5_idItem2 = scanner.nextInt();
                System.out.printf("Insira a quantidade do item 2: %n> ");
                int ex5_quantItem2 = scanner.nextInt();
                System.out.printf("Insira o valor de cada unidade do item 2: %n> ");
                double ex5_valItem2 = scanner.nextDouble();
                System.out.println("=====================\n\t\tTotal\n=====================");
                System.out.printf("Valor a pagar: R$ %.2f", ex5_quantItem1 * ex5_valItem1 + ex5_quantItem2 * ex5_valItem2);
                break;
            case 6:
                //Exercício 6
                System.out.printf("Insira o valor do A: %n> ");
                double ex6_valA = scanner.nextDouble();
                System.out.printf("Insira o valor do B: %n> ");
                double ex6_valB = scanner.nextDouble();
                System.out.printf("Insira o valor do C: %n> ");
                double ex6_valC = scanner.nextDouble();
                System.out.printf("TRIANGULO: %.3f %nCIRCULO: %.3f %nTRAPEZIO: %.3f %nQUADRADO: %.3f %nRETANGULO: %.3f", (ex6_valA * ex6_valC / 2), (3.14159 * Math.pow(ex6_valC, 2)), (((ex6_valA + ex6_valB) / 2) * ex6_valC), (Math.pow(ex6_valB, 2)), (ex6_valA * ex6_valB));
                break;
            default:
                System.out.println("Esse exercício não é válido");
        }
    }
}