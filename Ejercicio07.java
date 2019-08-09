import java.util.*;
/**
 * Ejercicio07
 */

public class Ejercicio07 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int tiempo;
        double precio = 0.00;

        System.out.println("Ingrese cantidad de tiempo");
        tiempo = teclado.nextInt();
        
        if (tiempo <= 2) {
            precio = tiempo * 5;
            System.out.println("El costo es: " + precio);

        } else {
            if (tiempo > 2 && tiempo <= 5) {
                precio = tiempo * 4;
                System.out.println("El costo es: " + precio);

            } else {
                if (tiempo > 5 && tiempo <= 10) {
                    precio = tiempo * 3;
                    System.out.println("El costo es: " + precio);

                } else {
                    precio = tiempo * 2;
                    System.out.println("El costo es: " + precio);
                }

            }

        }

    }
}