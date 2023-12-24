public class Main {
    public static void main(String[] args) {
        //Expressões aritméticas
        //soma
        System.out.println("2 + 2 = " + (2+2));
        //subtração
        System.out.println("5 - 2 = " + (5-2));
        //multiplicação
        System.out.println("7 * 3 = " + (7*3));
        //divisão
        System.out.println("12 / 3 = " + (12/3));
        //resto
        System.out.println("40 % 9 = " + (40%9));
        //Regras de precedência
        //1° lugar: * / %
        //2° lugar: + -
        System.out.println("4 + 9 * 5 = " + (4 + 9 * 5));
        System.out.println("2 / 2 * 4 = " + (2 / 2 * 4));
    }
}