import java.util.Random;
import java.util.Scanner;

public class AlteracaoAleatoria {
    static Scanner entrada = new Scanner(System.in);

    public static String alterarAleatorio(String frase, char letraAlterar, char letraNova) {
        char[] letra = new char[frase.length()];

        for (int i = 0; i < frase.length(); i++) {
            letra[i] = frase.charAt(i);
            if (frase.charAt(i) == letraAlterar) {
                letra[i] = letraNova;
            }
        }
        return new String(letra);
    }

    public static void main(String[] args) {
        Random gerador = new Random();
        char letraNova = (char) ('a' + Math.abs(gerador.nextInt() % 26));
        char letraAlterar = (char) ('a' + Math.abs(gerador.nextInt() % 26));

        //System.out.println("A letra que será alterada é: " + letraAlterar);
        String frase1 = entrada.nextLine();
        
        while (!frase1.equals("FIM")) {
            String fraseMod = alterarAleatorio(frase1, letraAlterar, letraNova);
            System.out.println(fraseMod);
            frase1 = entrada.nextLine();
        }
        entrada.close();
    }
}
