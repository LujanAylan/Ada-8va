import java.util.Scanner;

/**
 * Ejercicio08
 */

public class Ejercicio08{
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int calificacion;
        System.out.println("Ingrese calificacion: ");
        calificacion = teclado.nextInt();
        
        while (calificacion > 0 && calificacion < 10);
        {
            switch (calificacion) {
                case 10:
                    System.out.println("La calificación es A");
                    break;
                case 9:
                    System.out.println("La calificación es B");
                    break;
                case 8 :
                    System.out.println("La calificación es C");
                    break;
                case 7:
                case 6:
                    System.out.println("La calificación es D");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("La calificación es F");
                    break;
                    
            }
            calificacion = teclado.nextInt();
        }
    }
}