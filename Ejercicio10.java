import java.util.Scanner;

/**
 * Ejercicio10
 */
public class Ejercicio10 {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {
        int cantVocales = 0;
        int cantEspacios = 0;
        int cantPuntos = 0;

        char caracter;
        System.out.println("Ingrese una oración");
        caracter = Teclado.nextLine().charAt(0);

        while (caracter != '.') {
            switch (caracter) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    cantVocales++;
                    break;
                case ' ':
                    cantEspacios++;
                    break;
                }
                
            caracter = Teclado.nextLine().charAt(0);
        }
        cantPuntos++;
        System.out.println("Vocales " + cantVocales);
        System.out.println("Espacio " + cantEspacios);
        System.out.println("Puntos " + cantPuntos);
    }


}