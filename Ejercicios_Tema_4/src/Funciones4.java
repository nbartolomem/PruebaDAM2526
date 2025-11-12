public class Funciones4 {
    static boolean Vocal(char b) {
        boolean resultado;

        if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' ||
            b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U') {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("La E es una vocal: " + Vocal('E'));
        System.out.println("La F es una vocal: " + Vocal('F'));
    }
}
