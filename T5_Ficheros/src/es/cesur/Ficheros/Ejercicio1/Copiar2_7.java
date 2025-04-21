package es.cesur.Ficheros.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Copiar2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del fichero origen: ");
        String ficheroOrigen = sc.nextLine();
        
        System.out.print("Introduce el nombre del fichero destino: ");
        String ficheroDestino = sc.nextLine();
        
        try {
            // Verificar si el fichero destino existe
            File destino = new File(ficheroDestino);
            boolean añadir = false;
            
            if (destino.exists()) {
                System.out.print("El fichero destino ya existe. ¿Deseas añadir al final (1) o sobrescribir (2)? ");
                int opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                
                while (!(opcion == 1) && !(opcion == 2)) {
                    System.out.print("Opción no válida. Introduce 1 (añadir) o 2 (sobrescribir): ");
                    opcion = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                }
                
                añadir = (opcion == 1);
            }
            
            // Usar try-with-resources para manejo automático de cierre
            try (BufferedReader br = new BufferedReader(new FileReader(ficheroOrigen));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroDestino, añadir))) {
                
                String linea;
                while ((linea = br.readLine()) != null) {
                    bw.write(linea);
                    bw.newLine();
                }
                
                System.out.println("Contenido copiado correctamente a " + ficheroDestino + 
                                 (añadir ? " (añadido al final)" : " (sobrescrito)"));
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero origen no existe.");
        } catch (IOException e) {
            System.out.println("Error al copiar los ficheros: " + e.getMessage());
        } finally {
            sc.close(); // Cerrar Scanner al final
        }
    }
}
