public class Main {
    public static void main(String[] args) {
        String nomeCompleto = "Gabriel Silveira de Luna  ";

        //original
        System.out.println(nomeCompleto);
        //Deixar tudo minúsculo
        String s1 = nomeCompleto.toLowerCase();
        System.out.println(s1);
        //Deixar tudo maiúsculo
        String s2 = nomeCompleto.toUpperCase();
        System.out.println(s2);
        //Remover espaços
        String s3 = nomeCompleto.trim();
        System.out.println(s3);
        //Substring (index X à frente)
        String s4 = nomeCompleto.substring(8);
        System.out.println(s4);
        //Substring (index X - Y)
        String s5 = nomeCompleto.substring(8,15);
        System.out.println(s5);
        //Substituir um caractere
        String s6 = nomeCompleto.replace('a', '4');
        System.out.println(s6);
        //Substituir parte de uma string
        String s7 = nomeCompleto.replace("de", "da");
        System.out.println(s7);
        //Pegar o index de um caractere (ou string)
        int s8 = nomeCompleto.indexOf('a');
        System.out.println(s8);
        //Pegar o index do último uso de um caractere (ou string)
        int s9 = nomeCompleto.lastIndexOf('a');
        System.out.println(s9);
        //Separar partes de uma string, armazenando-os num vetor (array)
        String[] partesNome = nomeCompleto.split(" ");
        for (int i = 0; i < partesNome.length; i++) {
            System.out.printf("Index %d: %s %n", i, partesNome[i]);
        }
    }
}