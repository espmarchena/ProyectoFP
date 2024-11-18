package estudiandoparaelexamen1;

import java.util.Scanner;

public class e1211 {

    public static void main(String[] args) {
    	 //Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
     	 //Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de ventas");
        int numVentas=sc.nextInt();
 
        /*Declaramos una variable para sumar las ventas,
         * si lo declaramos dentro del bucle, no podriamos
         * acceder fuera del bucle a la suma de las ventas.
         * Esto es por el ámbito.
         */
        int contador=0;
        for (int i=0;i<numVentas;i++){
            //indico el numero de venta
            System.out.println("Introduce el precio de la venta "+(i+1));
            int precio =sc.nextInt();
 
            //Acumulamos el valor de la venta
            contador+=precio;
        }
 
        System.out.println(contador);
        
        sc.close();
    }
}
