import java.util.*;

/**
 * Ejercicio11
 */
public class Ejercicio11 {
    public static Scanner teclado = new Scanner (System.in);
    public static void main(String []args) {

        int [] edades = new int [10];
        int numero;

        for (int i =0; i < 10; i++){
            System.out.println("Ingrese el numero# " + i);
            numero = teclado.nextInt();
            edades [i] = numero;
        }
        int suma = 0;
        int prom = 0;

        for (int i =0; i < 10; i++){
            suma = suma + edades[i];
        }

        prom = suma / 10;
        System.out.println("El promedio es: "+ prom);
        System.out.println("Edades recibidas");

        for (int i =0; i < 10; i++){
            System.out.println("Edad " + edades [i]);
        }
       
    }
}