import java.util.Scanner;

public class Funciones15_2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Escribe el valor máximo: ");
        int vMax = sc.nextInt();
        
        System.out.println("Escribe el valor minimo: ");
        int vMin = sc.nextInt();
        
        System.out.println("Escribe el numero de valores aleatorios: ");
        int numAleatorio = sc.nextInt();
        
        System.out.println("Numeros aleatorios: ");
        numerosAleatorios(vMax, vMin, numAleatorio);
        
        System.out.println("Numeros aleatorios entre 0 y 1: ");
        numerosAleatorios(numAleatorio);
    }
    
    static void numerosAleatorios(int vMax, int vMin, int numAleatorio){
        for (int i = 0; i < numAleatorio; i++) {
            int num = vMin + (int)(Math.random() * (vMax - vMin + 1));
            System.out.println(num + "\n");
        }
    }
    
    static void numerosAleatorios(int numAleatorio){
        for (int i = 0; i < numAleatorio; i++) {
            double num = Math.random();
            System.out.println(num + "\n");
        }
    }
}