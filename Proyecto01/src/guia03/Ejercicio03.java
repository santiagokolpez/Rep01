 /* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
    Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
    un mensaje por pantalla que diga “CORRECTO”, 
    en caso contrario, se deberá imprimir “INCORRECTO”. 
    Nota: investigar la función Lenght() en Java. */
package guia03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase o palabra de 8 de largo");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String fraseopalabra = leer.next();
       
         if (fraseopalabra.length() == 8) {   
           System.out.println("Correcto");
       }  else {  //sino
           System.out.println("Incorrecto");
       }
        
        
    }
}
