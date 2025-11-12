import java.util.Scanner;

public class Funciones12 {

    // Devuelve true si n es primo
    static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el número: ");
        int n = sc.nextInt();

        System.out.println("Divisores primos de " + n + ":");

        for (int j = 2; j <= n; j++) {  // recorremos todos los números hasta n
            if (n % j == 0 && esPrimo(j)) {
                System.out.println(j);
            }
        }
    }
}
