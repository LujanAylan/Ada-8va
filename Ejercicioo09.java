import java.util.*;

/**
 * Ejercicioo09
 */
public class Ejercicioo09 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int anio;
        System.out.println("Ingrese año");
        anio = teclado.nextInt();
        System.out.println("El año ingresado es " + anio);

        System.out.println("Es año bisiesto? " + esAnioBisiesto(anio));


        if (esAnioBisiesto(anio)) {
            System.out.println("Es bisiesto");

        } else {
            System.out.println("No es bisiesto");
        }
        System.out.println("El anio despues de la funcion es" + anio);

    }

    public static boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));

    }
}