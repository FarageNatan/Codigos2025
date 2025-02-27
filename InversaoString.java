import java.util.Scanner;

public class InversaoString {
    static Scanner entrada = new Scanner(System.in);
    public static String inverterString(String frase){
        char[] inverter = new char[frase.length()];
        for(int i = frase.length(); i > 0; i--){
            if(frase.charAt(i) != inverter[i]){
                inverter[i] = frase.charAt(i);
            }
        }
        return new String(inverter);
    }

    public static void main(String[] args) {
        String fraseTeste;
        fraseTeste = entrada.nextLine();
        while(fraseTeste.compareTo("FIM") != 0){
            inverterString(fraseTeste);
            System.out.println(fraseTeste);
            fraseTeste = entrada.nextLine();
        }
    }
    
}
