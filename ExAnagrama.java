import java.util.Scanner;

public class ExAnagrama {
    static Scanner entrada = new Scanner(System.in);

    public static boolean palavraAnagrama(String p1, String p2) {
        boolean ehAnagrama = true;
        if (p1.length() != p2.length()) {
            ehAnagrama = false;
        }

        int[] contagem1 = new int[300];
        int[] contagem2 = new int[300];

        for (int i = 0; i < p1.length(); i++) {
            contagem1[p1.charAt(i)]++;
            contagem2[p2.charAt(i)]++;
        }

        for (int i = 0; i < 300; i++) {
            if (contagem1[i] != contagem2[i]) {
                ehAnagrama = false;
            }
        }

        return ehAnagrama;
    }

    public static void main(String[] args) {
        String palavra1, palavra2;
        palavra1 = entrada.nextLine();
        palavra2 = entrada.nextLine();

        while (palavra1.length() != 3 || palavra1.charAt(0) != 'F' || palavra1.charAt(1) != 'I' || palavra1.charAt(2) != 'M') {
            if (palavraAnagrama(palavra1, palavra2)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
            
            palavra1 = entrada.nextLine();
            palavra2 = entrada.nextLine();
        }
    }
}
