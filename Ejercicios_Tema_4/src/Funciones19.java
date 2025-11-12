import java.util.Scanner;

public class Funciones19 {
    
    //Variables globales para operar con las ventas
    static double totalVentas = 0; //Cuenta el dinero total con las ventas
    static int numVentas = 0; //Cuenta el total de ventas
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int opcion; 
       
       //Bucle principal del programa
       do {            
       mostrarMenu(); //Muestra el menú
       opcion = sc.nextInt(); //Pide la opción al usuario
            
       //Ejecuta dependiendo de la opción elegida
        switch (opcion) {
            case 1 -> agregarVenta(); //Agregar venta nueva
            case 2 -> mostrarTotalVentas(); //Mostrar el total de ventas
            case 3 -> mostrarNumeroVentas(); //Mostrar el número de ventas
            default -> System.out.println("Opción no válida");
        }
        } while (opcion != 4); //Termina si se elige la opcion 4
       
    }
    
    //Metodo que muestra el menu de opciones
    static void mostrarMenu (){
        System.out.println("==== MENÚ DE REGISTRO DE VENTAS ====");
        System.out.println("1. Añadir nueva venta");
        System.out.println("2. Ver total de ventas");
        System.out.println("3. Ver número de ventas");
        System.out.println("4. Salir");
        System.out.println("Elige una opción:");
    }
    
    //Pide el precio de la nueva venta y la suma
    static void agregarVenta(){
        Scanner sc = new Scanner(System.in);
        double ventas;
                
        do {            
        System.out.println("Introduce el valor de la venta: ");
        ventas = sc.nextDouble();
            if (ventas > 0) {
                numVentas ++; //Incrementa el numero de ventas
                totalVentas += ventas; //Suma el total de las ventas
            } else {
                System.out.println("Venta negativa no válida.");
            }
        } while (ventas < 0);
    }
    
    //Metodo qye muestra el total de las ventas
    static void mostrarTotalVentas(){
        System.out.println("El total vendido es: " + totalVentas);
    }
    
    //Metodo que muestra el numero de ventas
    static void mostrarNumeroVentas(){
        System.out.println("Se ha vendido: " + numVentas + " Veces");
    }
}