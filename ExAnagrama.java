public class ExAnagrama {
    public static boolean palavraAnagrama(String p1, String p2){
        boolean ehAnagrama = false;
        for(int i = 0; i < p1.length(); i++){
            if(p1.charAt(i) == p2.charAt(p1.length() - i - 1)){
                ehAnagrama = true;
            }
        }
        return ehAnagrama;
    }

    public static void main(String[] args) {
        String palavra1, palavra2;
        while(p1)
    }




}
