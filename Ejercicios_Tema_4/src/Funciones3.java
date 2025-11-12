import java.util.Scanner;
public class Funciones3 {
    static int Mayor (int num1, int num2){
        int max;
        
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print ("Escriba primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print ("Escriba segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.println("El numero mayor es: " + Mayor (num1, num2));
    }
}