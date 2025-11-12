import java.util.Scanner;

public class Funciones10 {
    
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
    int sumaMin1 = hora1 * 60 + minuto1;
    int sumaMin2 = hora2 * 60 + minuto2;
    
    return sumaMin2 - sumaMin1;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Escribe la primera hora: ");
       int hora1 = sc.nextInt();
       
       System.out.println("Escribe el primer minuto: ");
       int minuto1 = sc.nextInt();
       
       System.out.println("Escribe la segunda hora: ");
       int hora2 = sc.nextInt();
       
       System.out.println("Escribe el segundo minuto: ");
       int minuto2 = sc.nextInt();
       
        System.out.println(diferenciaMin(hora1, minuto1, hora2, minuto2));
    }
}