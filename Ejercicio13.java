import java.util.Scanner;

/**
 * Ejercicio13
 */
public class Ejercicio13 {

    public static Scanner Teclado = new Scanner (System.in);

    public static void main(String[] args) {
        int cantVocales = 0;
        int cantEspacios = 0;
        int cantPuntos = 0;

        String orac;
        char letras[];

        System.out.println("Escriba una oración :)");
        orac = Teclado.nextLine();

        letras = orac.toCharArray();

        for (int i = 0; i < letras.length; i++){

            if (esVocal(letras [i])) {
                cantVocales++;
            } 
            else if (letras [i]  == ' ') {
                cantEspacios++;
            }
        }
        cantPuntos++;

        System.out.println("Vocales " + cantVocales);
        System.out.println("Espacio " + cantEspacios);
        System.out.println("Puntos " + cantPuntos);
    }
    static boolean esVocal(char c){
        switch (c){
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