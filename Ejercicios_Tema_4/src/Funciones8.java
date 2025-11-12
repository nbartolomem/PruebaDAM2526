import java.util.Scanner;

public class Funciones8 {
    
    static double Distancia (double x1, double x2, double y1, double y2){
    return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x1, x2, y1, y2;
        
        System.out.println("Escribe x1: ");
        x1 = sc.nextDouble();
        System.out.println("Escribe x2: ");
        x2 = sc.nextDouble();
        System.out.println("Escribe y1: ");
        y1 = sc.nextDouble();
        System.out.println("Escribe y2: ");
        y2 = sc.nextDouble();
        
        System.out.println(Distancia(x1, x2, y1, y2));
    }
}