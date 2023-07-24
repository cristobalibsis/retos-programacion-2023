import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ingrese un texto que quiera traducir");
        Scanner teclado = new Scanner(System.in);
        String traductor = teclado.nextLine();

        // Llamamos al método traductor y almacenamos el resultado en una variable
        String traduccion = traductor(traductor);

        // Imprimimos la traducción en pantalla
        System.out.println("Texto traducido:");
        System.out.println(traduccion);
    }

    public static String traductor(String str) {
        String[] palabras = str.toLowerCase().split("\\s+");
        HashMap<String, String> traductor = new HashMap<>();
        traductor.put("a", "/\\");
        traductor.put("b", "/3");
        traductor.put("c", "<");
        traductor.put("d", "|)");
        traductor.put("e", "[-");
        traductor.put("f", "|=");
        traductor.put("g", "9");
        traductor.put("h", "!-!");
        traductor.put("i", "!");
        traductor.put("j", ",_]");
        traductor.put("k", "|<");
        traductor.put("l", "7");
        traductor.put("m", "/\\/\\");
        traductor.put("n", "[\\]");
        traductor.put("o", "0");
        traductor.put("p", "|º");
        traductor.put("q", "<|");
        traductor.put("r", "|2");
        traductor.put("s", "$");
        traductor.put("t", "†");
        traductor.put("u", "µ");
        traductor.put("v", "\\/");
        traductor.put("w", "\\/\\/");
        traductor.put("x", "Ж");
        traductor.put("y", "¥");
        traductor.put("z", "7_");
        traductor.put("0", "o");
        traductor.put("1", "|");
        traductor.put("2", "Z");
        traductor.put("3", "E");
        traductor.put("4", "A");
        traductor.put("5", "S");
        traductor.put("6", "G");
        traductor.put("7", "T");
        traductor.put("8", "B");
        traductor.put("9", "g");

        StringBuilder sb = new StringBuilder();
        for (String palabra : palabras) {
            for (char c : palabra.toCharArray()) {
                String check = traductor.get(String.valueOf(c));
                if (check == null) check = String.valueOf(c);
                sb.append(check);
            }
            sb.append(" ");
        }

        return sb.toString();
    }
}