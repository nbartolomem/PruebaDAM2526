import java.util.Scanner;

public class Funciones6 {
    
    static double suma(double num1, double num2) {
            return num1 + num2;
        }
    
    static double resta(double num1, double num2) {
            return num1 - num2;
        }
    
    static double multiplicacion(double num1, double num2) {
            return num1 * num2;
        }
    
    static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: división por cero");
            return 0;
        }
        return num1 / num2;
        }
    
        static double calculadora(double num1, double num2, int operacion) {
        return switch (operacion) {
            case 1 -> suma(num1, num2);
            case 2 -> resta(num1, num2);
            case 3 -> multiplicacion(num1, num2);
            case 4 -> division(num1, num2);
            default -> 0;
        };
    }
    
    static void mostrarMenu() {
        System.out.println("CALCULADORA BÁSICA NÚMEROS REALES");
        System.out.println("Menu de operaciones:");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
        System.out.println("5. SALIR");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacion;
        
        mostrarMenu();
        
        do {
            System.out.println("\nEscriba el tipo de operación:");
            operacion = sc.nextInt();
            
            System.out.println("Escriba el primer número:");
            double num1 = sc.nextDouble();

            System.out.println("Escriba el segundo número:");
            double num2 = sc.nextDouble();

            switch (operacion) {
                case 1, 2, 3 , 4 -> System.out.println("Resultado: " + calculadora(num1, num2, operacion));
                default -> System.out.println("Opción no válida");
            }
        } while (operacion != 5);
        System.out.println("Fin programa");
    }
}