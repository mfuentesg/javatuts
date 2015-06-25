import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static boolean caso1 (String a) {
        for (int i = 0, j = a.length() - 1; i < a.length() / 2; i++, j--) {
            if (a.charAt(i) != a.charAt(j)) return false;
        }

        return true;
    }

    public static boolean caso2 (String a) {
        String b = "";
        for (int i = a.length(); i > 0; i++) {
            b = b.concat(a.substring(i-1, i));
        }

        return a.compareToIgnoreCase(b) == 0;
    }

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresa tu palabra: ");
            String palabra = in.readLine();
            System.out.println(Main.caso1(palabra));
            System.out.println(Main.caso2(palabra));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Main.caso1("oso"));
        System.out.println(Main.caso2("ala"));
    }
}
