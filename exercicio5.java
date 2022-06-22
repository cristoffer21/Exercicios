public class exercicioprimos {
 
    public static void main(String[] args) { 
        int b;   
        for (int a = 2; a <= 123; a++) {
            if(primo(a))
                System.out.println(a + " é número primo.");
        }    
    }
 
    public static boolean primo(int numero) {
        for (int b = 2; b < numero; b++) {
            if (numero % b == 0)
                return false;   
        }
        return true;
    }
}