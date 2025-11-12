import java.util.Scanner;
public class Funciones1 {
        static void mostrar (int a, int b){
           int mayor = a > b ? a : b;
           int menor = a < b ? a : b;
            for (int i = (menor + 1); i < mayor; i++) {
                System.out.println(i);
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer número: ");
        int a = sc.nextInt();
        
        System.out.println("Escriba el segundo número: ");
        int b = sc.nextInt();
        
        mostrar(a, b);
    }
}