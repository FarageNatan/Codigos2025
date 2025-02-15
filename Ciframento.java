package Codigos2025;
import java.util.Scanner;

public class Ciframento {
    static Scanner entrada = new Scanner(System.in); 
    public static String fraseModificada(String frase){
        char [] modLetra = new char[frase.length()];
        for(int i = 0; i < frase.length(); i++)
        {
            modLetra[i] = (char)(frase.charAt(i) + 3);
        }
        return new String(modLetra);
    }
    
    
    public static void main(String[] args) {
       String frase1, fraseMod;
       frase1 = entrada.nextLine();
       while (frase1.compareTo("FIM") != 0) {
           fraseMod = fraseModificada(frase1);
           System.out.println(fraseMod);
           frase1 = entrada.nextLine();
       }
        entrada.close();
    }
}
