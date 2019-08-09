import java.util.Scanner;
/**
 * Ejercicio02
 */

public class Ejercicio02 {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        System.out.println("Ingrese a");
        a = Teclado.nextInt();

        System.out.println("Ingrese b");
        b = Teclado.nextInt();

        if (a>b) {
            System.out.println("a es mayor que b");
        }
         else {
             if (a<b) {
                System.out.println("a es menor que b");
             }
             else {
                System.out.println("a es igual que b");
             }

        }
            }
            
    }