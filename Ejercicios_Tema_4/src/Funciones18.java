import java.util.Scanner;

public class Funciones18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Precios a introducir: ");
        int numPrecios = sc.nextInt();

        double total = calcularTotal(numPrecios, sc);
        System.out.println("El precio total es: " + total);

        if (total > 100) {
            System.out.println("Supera los 100 euros, 10% de descuento");
            System.out.println("Nuevo precio: " + aplicarDescuento(total));
        }
    }

    static double calcularTotal(int numPrecios, Scanner sc) {
        double total = 0;
        for (int i = 0; i < numPrecios; i++) {
            System.out.println("Introduce precio: ");
            double precio = sc.nextDouble();
            if (precio > 0) {
                total += precio;
            } else {
                System.out.println("No se pueden precios negativos.");
                i --;
            }
        }
        return total;
    }

    static double aplicarDescuento(double total) {
        return total * 0.9;
    }
}
