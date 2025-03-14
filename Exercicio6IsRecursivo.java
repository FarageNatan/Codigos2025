import java.util.Scanner;

public class Exercicio6IsRecursivo {
    static Scanner entrada = new Scanner(System.in);

    //apenas vogais
    public static boolean fraseVogal(String frase, int index) {
        if (index >= frase.length()) {
            return true; //string foi verificada
        }
        char c = frase.charAt(index);
        if (!(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')) {
            return false; //nao eh vogal
        }
        return fraseVogal(frase, index + 1); //próximo caractere
    }

    //Indices vogal
    public static boolean fraseVogal(String frase) {
        return fraseVogal(frase, 0);
    }

    //apenas consoantes
    public static boolean fraseConso(String frase, int index) {
        if (index >= frase.length()) {
            return true;
        }
        char c = frase.charAt(index);
        if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u' || !Character.isLetter(c)) {
            return false; //não é letra, retorna false
        }
        return fraseConso(frase, index + 1); 
    }

    // indices Conso
    public static boolean fraseConso(String frase) {
        return fraseConso(frase, 0);
    }

    //número inteiro
    public static boolean ehInteiro(String numero, int index, boolean temSinal) {
        if (index >= numero.length()) {
            return index > (temSinal ? 1 : 0); // string não está vazia ou apenas com o sinal
        }
        char c = numero.charAt(index);
        if (index == 0 && (c == '+' || c == '-')) {
            return ehInteiro(numero, index + 1, true); // Permite sinal no início
        }
        if (c < '0' || c > '9') {
            return false; //não é dígito, retorna false
        }
        return ehInteiro(numero, index + 1, temSinal);
    }

    //Indices ehInteiro
    public static boolean ehInteiro(String numero) {
        return ehInteiro(numero, 0, false);
    }

    //é um número real
    public static boolean ehReal(String numero, int index, boolean temSinal, boolean temPonto) {
        if (index >= numero.length()) {
            return index > (temSinal ? 1 : 0);
        }
        char c = numero.charAt(index);
        if (index == 0 && (c == '+' || c == '-')) {
            return ehReal(numero, index + 1, true, temPonto); 
        }
        if (c == '.') {
            if (temPonto || index == 0 || index == numero.length() - 1) {
                return false; //permite apenas um ponto, no meio.
            }
            return ehReal(numero, index + 1, temSinal, true); //usou o ponto
        }
        if (c < '0' || c > '9') {
            return false; //não é dígito, retorna false
        }
        return ehReal(numero, index + 1, temSinal, temPonto);
    }

    //Indices ehReal
    public static boolean ehReal(String numero) {
        return ehReal(numero, 0, false, false);
    }

    public static void main(String[] args) {
        String fraseTeste = entrada.nextLine();
        while (!fraseTeste.equals("FIM")) {
            if (fraseVogal(fraseTeste)) {
                System.out.print("SIM ");
            } else {
                System.out.print("NAO ");
            }
            if (fraseConso(fraseTeste)) {
                System.out.print("SIM ");
            } else {
                System.out.print("NAO ");
            }
            if (ehInteiro(fraseTeste)) {
                System.out.print("SIM ");
            } else {
                System.out.print("NAO ");
            }
            if (ehReal(fraseTeste)) {
                System.out.print("SIM\n");
            } else {
                System.out.print("NAO\n");
            }
            fraseTeste = entrada.nextLine();
        }
        entrada.close();
    }
}