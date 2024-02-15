import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosArray = new int[5];
        for (int i = 0; i < numerosArray.length; i++) {
            numerosArray[i] = sc.nextInt();
        }
        for (int n1 : numerosArray) {
            System.out.println(n1);
        }

        List<Integer> numerosLista = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            numerosLista.add(sc.nextInt());
        }
        for (int n2 : numerosLista) {
            System.out.println(n2);
        }

        sc.close();
    }
}