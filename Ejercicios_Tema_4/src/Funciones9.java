import java.util.Scanner;

public class Funciones9 {

    static int Pares(int i){
        int par;
        par = i * 2 + 2;
        return par;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe cuantos números pares quieres: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(Pares(i));
        }
    }
}