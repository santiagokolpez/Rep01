/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

package guia02introajava;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingresá los grados centígrados");
            int celcius = leer.nextInt();
            int fahrenheit = 32 + (9 * celcius / 5);
            System.out.println("Su equivalencia en fahrenheit es de: " + fahrenheit);
    }
}
