import java.util.*;

/**
 * Ejercicio03
 */
public class Ejercicio03 {

    
    public static Scanner teclado = new Scanner (System.in);
        public static void main(String []args) {
            int contSueldo1 = 0;
            int contSueldo2 = 0;
            int contSueldo3 = 0;
            int contSueldo4 = 0;
            
            System.out.println("Ingrese sueldo");
            sueldo = teclado.nextInt();
            
            while (sueldo > 0){
                if (sueldo < 520){
                    contSueldo1 = contSueldo1 + 1
                }
                else{
                    if (sueldo >= 780 && sueldo < 780){
                        contSueldo2 = contSueldo2 +1;
                    } else{
                        if (sueldo >= 780 && sueldo <=999){
                            contSueldo3 = contSueldo3 + 1;
                        }else {
                            contSueldo4 = contSueldo4 + 1;
                        
                        }
                    }
                }
                System.out.prinln("Ingrese sueldo");
                sueldo = teclado.nextInt
            }
            System.out.prinln("Cantidad de empleados con sueldos inferiores a 520: " + contSueldo1);
            System.out.prinln("Cantidad de empleados con sueldos entre 520 y 780: " + contSueldo2);
            System.out.prinln("Cantidad de empleados con sueldos entre 780 y 999: " + contSueldo3);
            System.out.prinln("Cantidad de empleados con sueldos superiores a 999: " + contSueldo4);
         }
}
