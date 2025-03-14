import java.util.Scanner;

public class CiframentoRec {

    static Scanner entrada = new Scanner(System.in);

    //cifrar a frase recursivamente
    public static String fraseModificada(String frase, int i) {
        // final da string
        if (i >= frase.length()) {
            return "";
        }

        //Deslocamente de caracter
        char caractereModificado = (char) (frase.charAt(i) + 3);

        //Proximo caracter recursivo
        return caractereModificado + fraseModificada(frase, i + 1);
    }

    //Inicializar
    public static String fraseModificada(String frase) {
        return fraseModificada(frase, 0);
    }

    public static void main(String[] args) {
        String frase1, fraseMod;

        frase1 = entrada.nextLine();

        while (frase1.length() != 3 || frase1.charAt(0) != 'F' || frase1.charAt(1) != 'I' || frase1.charAt(2) != 'M') {
            fraseMod = fraseModificada(frase1);
            System.out.println(fraseMod);
            frase1 = entrada.nextLine();
        }

        entrada.close();
    }
}