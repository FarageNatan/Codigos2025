import java.util.Scanner;

public class VerificarSenha {
    static Scanner entrada = new Scanner(System.in);

    public static boolean podeSenha(String frase){

        boolean senhaValida = true, temSimbolo = false, temMin = false, temMai = false, temNum = false;

        if(frase.length() < 8){ //verificar tamanho
            senhaValida = false;
            return senhaValida;
        }
        
        for(int i = 0; i < frase.length(); i++){ //verificar se tem numero
            if (!(frase.charAt(i) < '0' || frase.charAt(i) > '9')){
                temNum = true;
            }
        }

        for(int i = 0; i < frase.length(); i++){ //verificar se tem letra minuscula
            if((frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z')){
                temMin = true;
            }
        }

        for(int i = 0; i < frase.length(); i++){ //verificar se tem letra maiuscula
            if((frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z')){
                temMai = true;
            }
        }

        for(int i = 0; i < frase.length(); i++){ //verificar se tem simbolo
            if(!((frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') || (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') || (frase.charAt(i) < '0' && frase.charAt(i) > '9'))){
                temSimbolo = true;
            }
        }

        if(temMai == true && temMin == true && temNum == true && temSimbolo == true){ //verificacao de todas as condicoes para senha ser válida
            return senhaValida;
        }else{
            senhaValida = false;
            return senhaValida;
        }

    }
    
    public static void main(String[] args) {
        String frase1;
        boolean frase2;
        frase1 = entrada.nextLine();
        while (frase1.length() != 3 || frase1.charAt(0) != 'F' || frase1.charAt(1) != 'I' || frase1.charAt(2) != 'M') {
            frase2 = podeSenha(frase1);
            if(frase2){
                System.out.println("SIM");
            }else{
                System.out.println("NAO");
            }
            frase1 = entrada.nextLine(); //segunda leitura para evitar loop infinito
        }
         entrada.close();
     }
}
