import java.util.Scanner;

/**
 * Ejercicio05
 */
public class Ejercicio05 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;
        double t1 = 0, t2 = 0, t3 = 0, tt = 0;
        int n;
        double cn = 1;
        double v;

        System.out.println("Ingrese el nro de ventas");
        n = Teclado.nextInt();

        while (cn <= n) {
            System.out.println("Ingrese el monto de la venta");
            v = Teclado.nextDouble();

            if (v > 1000) {
                a = a + 1;
                t1 = t1 + v;

            } else {
                if (v > 500) {
                    b = b + 1;
                    t2 = t2 + v;

                } else {
                    c = c + 1;
                    t3 = t3 + v;
                }

            }
            tt = tt + v;
            cn = cn + 1;

        }

        System.out.println("Cantidad de ventas y el total de ventas mayores a 1000 es: " + a + " , " + t1);
        System.out.println("Cantidad de ventas y el total de ventas mayores a 500  pero menores o iguales a 1000 es: "
                + b + " , " + t2);
        System.out.println("Cantidad de ventas y el total de ventas menores o iguales a 500 es: " + c + " , " + t3);
        System.out.println("El total de ventas es: " + tt);

    }
}