import java.util.Scanner;
/**
 * Ejercicio00
 */

public class Ejercicio00 {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String [] args) {
        int a, b, c;
        System.out.println("Ingrese el primer numero: ");
        a = Teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        b = Teclado.nextInt();

        c= a*b;

        System.out.println("El resultado es: "+ c);
    }
}