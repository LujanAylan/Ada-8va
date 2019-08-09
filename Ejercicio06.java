import java.util.*;
/**
 * 
 * Ejercicio06
 */

public class Ejercicio06 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args) {
        int zona;
        double peso=0.00;
        double precio=0.00, amdn = 11.00, amc = 10.00, amds = 12.00, eu = 24.00, as = 27.00;
        
        System.out.println("Ingrese zona");
        zona = teclado.nextInt();
        
        System.out.println("Ingrese peso del paquete: ");
        peso = teclado.nextDouble();

        if (peso < 5.00) {
            switch (zona) {
            case 1:
                precio = peso * amdn;
                System.out.println("El precio es " + precio);
                break;

            case 2:
                precio = peso * amc;
                System.out.println("El precio es " + precio);
                break;
            case 3:
                precio = peso*amds;
                System.out.println("El precio es " + precio);
                break;
            case 4:
                precio = peso *eu;
                System.out.println("El precio es " + precio);
                break;
            case 5:
                precio = peso*as;
                System.out.println("El precio es " + precio);
                break;
            }
        } else {
            System.out.println("No es posible enviar el paquete");
        }
    }

}