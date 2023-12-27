public class Main {
    public static void main(String[] args) {
        //Atribuição
        int x, y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);

        //Casting
        int n1, n2;
        double resultado;

        n1 = 5  ;
        n2 = 2;

        resultado = (double) n1 / n2;
        System.out.println(resultado);
    }
}