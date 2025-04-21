package es.cesur.Ficheros.Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Contar_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = sc.nextLine();
        
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            int vocales = 0;
            int numeros = 0;
            int consonantes = 0;
            int signosPuntuacion = 0;
            
            String linea;
            
            while ((linea = br.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    char c = linea.charAt(i);
                    
                    // Verificar si es letra
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        // Verificar vocales (mayúsculas y minúsculas)
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                            vocales++;
                        } else {
                            consonantes++;
                        }
                    } 
                    // Verificar números
                    else if (c >= '0' && c <= '9') {
                        numeros++;
                    } 
                    // Verificar signos de puntuación
                    else {
                        switch (c) {
                            case ' ': case '.': case ',': case ';': case ':':
                            case '!': case '?': case '"': case '\'': case '(':
                            case ')': case '[': case ']': case '{': case '}':
                            case '-': case '_': case '/': case '\\': case '|':
                            case '@': case '#': case '$': case '%': case '&':
                            case '*': case '+': case '=': case '<': case '>':
                                signosPuntuacion++;
                                break;
                        }
                    }
                }
                // Contar el salto de línea como espacio
                signosPuntuacion++;
            }
            
            System.out.println("Resultados del análisis del fichero:");
            System.out.println("Vocales: " + vocales);
            System.out.println("Consonantes: " + consonantes);
            System.out.println("Números: " + numeros);
            System.out.println("Signos de puntuación y espacios: " + signosPuntuacion);
            
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
