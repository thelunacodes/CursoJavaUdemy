import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista =  new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Ana");

        lista.add(2, "Andrea");

        for (String nome : lista) {
            System.out.println(nome);
        }
        System.out.println("-------------------------------");
        //lista.remove("Ana");
        //lista.remove(1);
        //lista.removeIf(x -> x.charAt(0) == 'A');
        //for (String nome : lista) {
        //    System.out.println(nome);
        //}
        System.out.println("-------------------------------");
        System.out.println("Index of Bob: " + lista.indexOf("Bob"));
        System.out.println("Index of Marco: " + lista.indexOf("Marco"));
        System.out.println("-------------------------------");
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String nome : resultado) {
            System.out.println(nome);
        }
        System.out.println("-------------------------------");
        String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}