/* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java. */
package guia03estructurasdecontrol;

import java.util.Scanner;
/*                                 ME FALTÓ USAR SUBSTRING Y EQUALS   */

public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase o palabra");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String fraseopalabra = leer.next();
       
     if (fraseopalabra.startsWith("a") || fraseopalabra.startsWith("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        
    }
}
