public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 0 && x < 10); //As duas condições devem ser verdadeiras
        System.out.println(x == 4 || x == 6); //Pelo menos uma condição deve ser verdadeira
        System.out.println(!(x + 2 == 10)); //Inverte a expressão, tornando o que é true em false e vice versa
    }
}