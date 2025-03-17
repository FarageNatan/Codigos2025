import java.util.Scanner;

public class SomaDigitos {

    public static int somaRecursiva(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + somaRecursiva(num / 10); //funcao recursiva para somar os digitos
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String n1 = entrada.nextLine();

        while (!(n1.length() == 3 && n1.charAt(0) == 'F' && n1.charAt(1) == 'I' && n1.charAt(2) == 'M')) {
            int numero = 0;

            for (int i = 0; i < n1.length(); i++) { //conversao de String para inteiro
                numero = numero * 10 + (n1.charAt(i) - '0');
            }

            System.out.println(somaRecursiva(numero));
            n1 = entrada.nextLine();
        }

        entrada.close();
    }
}
