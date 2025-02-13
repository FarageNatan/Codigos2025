package Codigos2025;
import java.util.Scanner;

public class MinhaClasse {
    public static boolean isPalindromo(String frase){
        int inicio = 0, fim = frase.length() - 1;
        boolean pal = true;
        while(inicio < fim)
        {
            if(frase.charAt(inicio) != frase.charAt(fim)){
                pal = false;
            }
            inicio++;
            fim--;
        }
        return pal;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primeiraFrase;
        primeiraFrase = entrada.nextLine();
        while(primeiraFrase.compareTo("FIM") != 0){
            if(isPalindromo(primeiraFrase)){
                System.out.println("SIM");
            }
            else{
                System.out.println("NAO");
            }
            primeiraFrase = entrada.nextLine();
        }
        entrada.close();
    }
}