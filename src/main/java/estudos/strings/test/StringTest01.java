package estudos.strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Allan  ";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("a","b"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0,2));
        System.out.println(nome.trim());

    }
}
