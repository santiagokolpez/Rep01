/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. */

package guia02introajava;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        System.out.println(nombre);
     }
}
