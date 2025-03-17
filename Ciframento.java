import java.util.Scanner;

public class Ciframento {
    static Scanner entrada = new Scanner(System.in); 
    public static String fraseModificada(String frase){
        char [] modLetra = new char[frase.length()]; //vetor de caracter para conseguir modificar a string
        for(int i = 0; i < frase.length(); i++)
        {
            modLetra[i] = (char)(frase.charAt(i) + 3); //modificacao do caracter
        }
        return new String(modLetra);
    }
    
    
    public static void main(String[] args) {
       String frase1, fraseMod;
       frase1 = entrada.nextLine();
       while (frase1.length() != 3 || frase1.charAt(0) != 'F' || frase1.charAt(1) != 'I' || frase1.charAt(2) != 'M') {
           fraseMod = fraseModificada(frase1);
           System.out.println(fraseMod);
           frase1 = entrada.nextLine(); //evitar loop infinito
       }
        entrada.close();
    }
}
