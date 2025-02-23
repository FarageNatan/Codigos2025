import java.util.Scanner;

public class Exercicio6Is {
    static Scanner entrada = new Scanner(System.in);

    public static boolean fraseVogal(String frase) {
        boolean resp = true;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')) {
                resp = false;
            }
        }
        return resp;
    }

    public static boolean fraseConso(String frase) {
        if (ehInteiro(frase) || ehReal(frase)) {
            return false;
        }
        boolean resp = true;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u') {
               resp = false;
            }
        }
        return resp;
    }

    public static boolean ehInteiro(String numero){
        if (numero.length() == 0) {
            return false;
        }

        int inicio = 0;
        if (numero.charAt(0) == '-') {
            if (numero.length() == 1) {
                return false;
            }
            inicio = 1;
        }

        for (int i = inicio; i < numero.length(); i++) {
            if (numero.charAt(i) < '0' || numero.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean ehReal(String numero){
        if (numero.length() == 0) {
            return false;
        }

        int inicio = 0;
        boolean temPonto = false;

        if (numero.charAt(0) == '-') {
            if (numero.length() == 1) {
                return false;
            }
            inicio = 1;
        }

        for (int i = inicio; i < numero.length(); i++) {
            char c = numero.charAt(i);

            if (c == '.') {
                if (temPonto || i == inicio || i == numero.length() - 1) {
                    return false;
                }
                temPonto = true;
            } else if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String fraseTeste = entrada.nextLine();
        while (!fraseTeste.equals("FIM")) {
            if (fraseVogal(fraseTeste)) {
                System.out.println("X1");
            }
            if (fraseConso(fraseTeste)) {
                System.out.println("X2");
            }
            if(ehInteiro(fraseTeste)){
                System.out.println("X3");
            }
            if(ehReal(fraseTeste)){
                System.out.println("X4");
            }
            fraseTeste = entrada.nextLine();
        }
    }
}
