import java.util.*;

/**
 * Ejercicio09
 */
public class Ejercicio09 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int anio;
        System.out.println("Ingrese año");
        anio = teclado.nextInt();

        if (esAnioBisiesto(anio)) {
            System.out.println("Es bisiesto");

        } else {
            System.out.println("No es bisiesto");
        }

    }

    public static boolean esAnioBisiesto(int anio) {
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }
}