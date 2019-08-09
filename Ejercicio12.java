import java.util.*;

/**
 * Ejercicio12
 */
public class Ejercicio12 {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {
        int [] A = new int [7];
        int [] B = new int [7];
        int [] C = new int [7];
        
        int numero;
        int numero2;

        for (int i =0; i < 7; i++){
            System.out.println("Ingrese el numero " + (i + 1) + " del grupo A");
            numero = Teclado.nextInt();
            A[i] = numero;
        }
        for (int i =0; i < 7; i++){
            System.out.println("Ingrese el numero " + (i + 1) + " del grupo B");
            numero2 = Teclado.nextInt();
            B[i] = numero2;
        }

        for (int i =0; i < 7; i++){
        C[i] = A[i] + B[i]; 
        System.out.println("La suma de " + A[i]+ " y " + B[i] + " es igual a " + C[i]);
        }
    }
}