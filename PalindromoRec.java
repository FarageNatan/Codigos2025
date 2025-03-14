import java.util.Scanner;

public class PalindromoRec {

    public static boolean isPalindromo(String frase, int inicio, int fim) {
        boolean ehPalindromo = true;
        // Caso base
        if (inicio >= fim) {
            return ehPalindromo;
        }

        if (frase.charAt(inicio) != frase.charAt(fim)) {
            ehPalindromo = false;
            return ehPalindromo;
        }

        // Continuar a verificação
        return isPalindromo(frase, inicio + 1, fim - 1);
    }

    // Passando os índices
    public static boolean isPalindromo(String frase) {
        return isPalindromo(frase, 0, frase.length() - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primeiraFrase;

        primeiraFrase = entrada.nextLine();

        while (!primeiraFrase.equals("FIM")) {
            if (isPalindromo(primeiraFrase)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
            primeiraFrase = entrada.nextLine();
        }

        entrada.close();
    }
}