import java.util.Scanner;

public class Funciones16_reiterativa {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int Exponente;
       double Base;
       
        do {            
            System.out.println("Escribe la base: ");
            Base = sc.nextInt();

            System.out.println("Escribe el exponente: ");
            Exponente = sc.nextInt();
            
            System.out.println("Resultado: " + potencia(Base, Exponente));
        } while (Base != 0);
        System.out.println("Base 0, fin de programa");
    }
    
    static double potencia (double Base, int Exponente){
        double resultado = 1;
        
        for (int i = 1; i <= Exponente; i++) {
            if (Exponente > 0) {
                resultado = Base * potencia(Base, Exponente - 1);
            } else {
                resultado = 1;
            }
        }
        return resultado;
    }
}