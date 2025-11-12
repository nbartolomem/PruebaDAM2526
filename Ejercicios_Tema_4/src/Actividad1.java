import java.util.Scanner;
public class Actividad1 {
    
    static void eco (int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Eco...");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();
        
        System.out.println("---Antes de llamar a la función---");
        
        eco(num);
        
        System.out.println("---Después de llamar a la función---");
    }
        
}