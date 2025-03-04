import java.util.Scanner;

public class InversaoString {
    static Scanner entrada = new Scanner(System.in);
    public static String inverterString(String frase){
        char[] inverter = new char[frase.length()];
        for(int i = 0; i < frase.length() ; i++){
                inverter[i] = frase.charAt(frase.length() - 1 - i);
        }
        return new String(inverter);
    }

    public static void main(String[] args) {
        String fraseTeste, fraseInvertida;
        fraseTeste = entrada.nextLine();
        while(fraseTeste.compareTo("FIM") != 0){
            fraseInvertida = inverterString(fraseTeste);
            System.out.println(fraseInvertida);
            fraseTeste = entrada.nextLine();
        }
    }
}
