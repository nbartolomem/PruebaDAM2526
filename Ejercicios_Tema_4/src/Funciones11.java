import java.util.Scanner;

public class Funciones11 {

    static boolean esPrimo(int n){
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Escribe un número: ");
        int n = sc.nextInt();
        
        System.out.println("¿El numero es primo?: " + esPrimo(n));
        
    }
}