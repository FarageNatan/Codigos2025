import java.util.Scanner;

public class MinhaClasse {
    public static boolean isPalindromo(String frase){
        int inicio = 0, fim = frase.length() - 1;
        boolean palavra = true;
        while(inicio < fim)
        {
            if(frase.charAt(inicio) != frase.charAt(fim)){
                palavra = false;
            }
            inicio++;
            fim--;
        }
        return palavra;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primeiraFrase;
        primeiraFrase = entrada.nextLine();
        while (´primeiraFrase.length() != 3 || ´primeiraFrase.charAt(0) != 'F' || ´primeiraFrase.charAt(1) != 'I' || ´primeiraFrase.charAt(2) != 'M') {
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