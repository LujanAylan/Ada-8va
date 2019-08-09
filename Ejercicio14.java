import java.util.Scanner;

import com.sun.jndi.url.iiop.iiopURLContext;
public class Ejercicio14{

public static Scanner Teclado = new Scanner (System.in);
    public static void main(String [] args) {
        int n;
        int suma = 0;

        System.out.println("Ingrese cant numeros");
        n = Teclado.nextInt();

        boolean hay13 = false;

        //se declara el array de n posiciones//
        int [] nros = new int [n];

        //el for recorre el array para llenarlo (siempre)//
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero ");

            nros [i] = Teclado.nextInt();
        }

        //el for recorre el array y pregunta por 13//
        for (int i = 0; i < n; i++) {
            if (nros[i] == 13) {
                hay13 = true;
            } else {
                //no hay 13//
                if (!hay13) {
                    suma = suma + nros[i];
                } else {
                    hay13 = false;
                }
            }
        }
        System.out.println("La suma es " + suma);
    }
}