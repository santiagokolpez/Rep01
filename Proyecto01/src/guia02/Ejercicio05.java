/* Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt(). */

package guia02;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("Su doble es : " + (numero*2));
        System.out.println("Su triple es : " + (numero*3));
        System.out.println("Su raiz cuadrada es: " + raizCuadrada);
    }
}

/*      Otra versión:

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        int numeroDoble = numero * 2;
        int numeroTriple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("Su doble es : " + numeroDoble);
        System.out.println("Su triple es : " + numeroTriple);
        System.out.println("Su raiz cuadrada es: " + raizCuadrada);    */