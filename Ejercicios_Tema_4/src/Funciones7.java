import java.util.Scanner;

public class Funciones7 {
    
    static void MostrarMenu(){
        System.out.println("1. Longitud de la circunferencia");
        System.out.println("2. Área del círculo");
        System.out.println("3. Área de la esfera");
        System.out.println("4. Área del cilindro");
        System.out.println("5. Volumen de la esfera");
        System.out.println("6. Volumen del cilindro");
        System.out.println("7. Nuevo radio");
        System.out.println("8. Salir");
    }
    
    static double AreaCirculo (double radio){ 
        return  Math.PI * radio * radio;
    }
    
    static double Circunferencia (double radio){
        return 2 * Math.PI * radio;
    }
    
    static double AreaEsfera (double radio){
        return  4 * Math.PI * radio * radio * radio * radio;
    }
    
    static double AreaCilindro (double radio){
        Scanner sc = new Scanner(System.in);
        double altura;
        
        System.out.println("Escribe altura: ");
        altura = sc.nextDouble();
        
        return  (2 * Math.PI * radio * radio) + (2 * Math.PI * radio * altura);
    }
    
    static double VolumenEsfera (double radio){
        return  4/3 * Math.PI * radio * radio * radio;
    }
    
    static double VolumenCilindro (double radio){
        Scanner sc = new Scanner(System.in);
        double altura;
        
        System.out.println("Escribe altura: ");
        altura = sc.nextDouble();
        
        return Math.PI * radio * radio * altura;
    }
    
    static double NuevoRadio (double radio){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el nuevo radio: ");
        radio = sc.nextDouble();
       
        return radio;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio = 0;
        int operacion;

        MostrarMenu();
        
        do {
            System.out.print("Introduce el tipo de operación: ");
            operacion = sc.nextInt();

            if (operacion >= 1 && operacion <= 6) {
                System.out.print("Introduce el radio: ");
                radio = sc.nextDouble();
            }

            switch (operacion) {
                case 1 -> System.out.println("Longitud circunferencia: " + Circunferencia(radio));
                case 2 -> System.out.println("Área círculo: " + AreaCirculo(radio));
                case 3 -> System.out.println("Área esfera: " + AreaEsfera(radio));
                case 4 -> System.out.println("Área cilindro: " + AreaCilindro(radio));
                case 5 -> System.out.println("Volumen esfera: " + VolumenEsfera(radio));
                case 6 -> System.out.println("Volumen cilindro: " + VolumenCilindro(radio));
                case 7 -> radio = NuevoRadio(radio);
                case 8 -> System.out.println("Fin operación.");
                default -> System.out.println("Opción no válida.");
            }

            System.out.println();

        } while (operacion != 8);
    }
}