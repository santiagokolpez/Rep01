/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
   Nota: investigar la función toUpperCase() y toLowerCase() en Java. */

package guia02;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();   //con next solo nos toma la primera palabra ("hola"); con nextLine toma las 2 ("hola mundo")
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
