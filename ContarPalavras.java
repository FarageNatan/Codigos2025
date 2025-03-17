import java.util.Scanner;

public class ContarPalavras {

    public static int contarPalavras(String frase) {
        int totalPalavras = 0;
        boolean aindaPalavra = false;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') { //verifica se a palavra esta separada de espaço
                if (!aindaPalavra) {
                    totalPalavras++;
                    aindaPalavra = true;
                }
            } else {
                aindaPalavra = false;
            }
        }

        return totalPalavras;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String linha = entrada.nextLine();

        while (!(linha.length() == 3 && linha.charAt(0) == 'F' && linha.charAt(1) == 'I' && linha.charAt(2) == 'M')) {
            System.out.println(contarPalavras(linha));
            linha = entrada.nextLine();
        }

        entrada.close();
    }
}
