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
        boolean X3 = true;
        if (numero.length() == 0) {
            X3 = false;
        }

        int inicio = 0;
        if (numero.charAt(0) == '-') {
            if (numero.length() == 1) {
                X3 = false;
            }
            inicio = 1;
        }

        for (int i = inicio; i < numero.length(); i++) {
            if (numero.charAt(i) < '0' || numero.charAt(i) > '9') {
                X3 = false;
            }
        }
        return X3;
    }

    public static boolean ehReal(String numero){
        boolean X4 = true;
        if (numero.length() == 0) {
            X4 = false;
        }
        int inicio = 0;
        boolean temPonto = false;

        if (numero.charAt(0) == '-') {
            if (numero.length() == 1) {
                X4 = false;
            }
            inicio = 1;
        }

        for (int i = inicio; i < numero.length(); i++) {
            char c = numero.charAt(i);

            if (c == '.') {
                if (temPonto || i == inicio || i == numero.length() - 1) {
                    X4 = false;
                }
                temPonto = true;
            } else if (c < '0' || c > '9') {
                X4 = false;
            }
        }
        return X4;
    }

    public static void main(String[] args) {
        String fraseTeste = entrada.nextLine();
        while (!fraseTeste.equals("FIM")) {
            if (fraseVogal(fraseTeste)) {
                System.out.print("SIM ");
            }else{
                System.out.print("NAO ");
            }
            if (fraseConso(fraseTeste)) {
                System.out.print("SIM ");
            }else{
                System.out.print("NAO ");
            }
            if(ehInteiro(fraseTeste)){
                System.out.print("SIM ");
            }else{
                System.out.print("NAO ");
            }
            if(ehReal(fraseTeste)){
                System.out.print("SIM\n");
            }else{
                System.out.print("NAO\n");
            }
            fraseTeste = entrada.nextLine();
        }
    }
}
