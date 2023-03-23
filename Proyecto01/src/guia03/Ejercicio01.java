    /*Crear un programa que dado un número determine si es par o impar. */
package guia03;

import java.util.Scanner;


public class Ejercicio01 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número entero");
       int num = leer.nextInt();  //tengo q leer num
                
       if (num % 2 == 0) {    //si num Mod2 = 0 es par
           System.out.println("El número es par");
       }  else {  //sino
           System.out.println("El número es impar");
       }
                
                
    }
}
