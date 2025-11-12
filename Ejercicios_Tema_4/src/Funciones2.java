import java.util.Scanner;
public class Funciones2 {
    static void calculoCilindro (double radio, double altura, int tipoCalculo){
            double volumen, area;
            
            switch (tipoCalculo){
                case 1 -> {
                    area = Math.PI * 2 * radio *  (altura + radio);
                    System.out.println("El área es: " + area);
                }
                case 2 -> {
                    volumen = Math.PI * radio * radio *  altura;
                    System.out.println("El volumen es: " + volumen);
                }
                default ->{
                    System.out.println("Número inválido");
                }
            }    
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer número: ");
        double radio = sc.nextDouble();
        
        System.out.println("Escriba el segundo número: ");
        double altura = sc.nextDouble();
        
        System.out.println("Qué desea calcular (1 (área)/ 2 (volumen): ");
        int tipoCalculo = sc.nextInt();
        
        calculoCilindro(radio, altura, tipoCalculo);
    }
}