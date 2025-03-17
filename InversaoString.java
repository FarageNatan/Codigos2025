import java.util.Scanner;

public class InversaoString {
    static Scanner entrada = new Scanner(System.in);
    public static String inverterString(String frase){
        char[] inverter = new char[frase.length()]; //como nao é possivel alterar os caracteres da string, usei um vetor de caracter
        for(int i = 0; i < frase.length() ; i++){
                inverter[i] = frase.charAt(frase.length() - 1 - i); //guarda a ultima posicao da string no primeiro lugar do vetor de caracter para inverter
        }
        return new String(inverter);
    }

    public static void main(String[] args) {
        String fraseTeste, fraseInvertida;
        fraseTeste = entrada.nextLine();
        while (fraseTeste.length() != 3 || fraseTeste.charAt(0) != 'F' || fraseTeste.charAt(1) != 'I' || fraseTeste.charAt(2) != 'M') {
            fraseInvertida = inverterString(fraseTeste);
            System.out.println(fraseInvertida);
            fraseTeste = entrada.nextLine(); //evitar loop infinito
        }
    }
}
