import java.util.Scanner;

/**
 * Ejercicioo10
 */
public class Ejercicioo10 {
    public static Scanner Teclado = new Scanner (System.in);

    public static void main(String[] args) {
        int cantVocales = 0;
        int cantEspacios = 0;
        int cantPuntos = 0;

        char caracter;
        System.out.println("Ingrese una oración caracter por caracter :)");

        caracter = Teclado.nextLine().charAt(0);
        
        while (caracter != '.') {
            if (esVocal(caracter)) {
                cantVocales++;
            } else if (caracter  == ' ') {
                cantEspacios++;
            }
            caracter = Teclado.nextLine().charAt(0);
        }
        cantPuntos++;

        System.out.println("Vocales " + cantVocales);
        System.out.println("Espacio " + cantEspacios);
        System.out.println("Puntos " + cantPuntos);
    }
    static boolean esVocal(char caracter2){
        switch (caracter2){
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
            return true;
        }     
        return false;
    }
}