import java.util.Scanner;

public class Actividad9 {

    static int Mayor(int num1, int num2) {
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    static int Mayor(int num1, int num2, int num3) {
        int max;
        if (Mayor(num1, num2) > num3) {
            max = Mayor(num1, num2);
        } else {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Escriba segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Escriba tercer número: ");
        int num3 = sc.nextInt();

        System.out.println("El número mayor es: " + Mayor(num1, num2, num3));
    }
}
