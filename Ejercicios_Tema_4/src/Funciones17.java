import java.util.Scanner;

public class Funciones17 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Escribe un numero: ");
        int numero = sc.nextInt();

        System.out.println("La suma es: " + sumaDigitos(numero));
    }
    
    static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return (numero % 10) + sumaDigitos(numero / 10);
        }
    }
}