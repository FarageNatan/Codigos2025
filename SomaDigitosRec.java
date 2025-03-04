import java.util.Scanner;

public class SomaDigitosRec {
    static Scanner entrada = new Scanner(System.in);
    public static int CalcSoma(int valor){
        if(valor == 0){
            return 0;
        }
        if(valor > 0){
        return valor + CalcSoma(valor % 10);
    }
}

    public static void main(String[] args) {
        String stop = entrada.nextLine();
        
        while (stop.length() != 3 || stop.charAt(0) != 'F' || stop.charAt(1) != 'I' || stop.charAt(2) != 'M') {
            int numero = 0;
            boolean valido = true;
    
            for (int i = 0; i < stop.length(); i++) {
                if (stop.charAt(i) < '0' || stop.charAt(i) > '9') {
                    valido = false;
                }
                if (valido) {
                    numero = numero * 10 + (stop.charAt(i) - '0');
                }
            }
    
            if (valido) {
                int soma = CalcSoma(numero);
                System.out.println(soma);
            }
    
            stop = entrada.nextLine();
        }
    }
}