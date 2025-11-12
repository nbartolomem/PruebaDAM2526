import java.util.Scanner;

public class Funciones15 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Escribe el valor máximo: ");
        int vMax = sc.nextInt();
        
        System.out.println("Escribe el valor minimo: ");
        int vMin = sc.nextInt();
        
        System.out.println("Escribe el numero de valores aleatorios: ");
        int numAleatorio = sc.nextInt();
        
        numerosAleatorios(vMax, vMin, numAleatorio);
    }
    
    static void numerosAleatorios(int vMax, int vMin, int numAleatorio){
        for (int i = 0; i < numAleatorio; i++) {
            int num = vMin + (int)(Math.random() * (vMax - vMin + 1));
            System.out.println(num);
        }
    }
}