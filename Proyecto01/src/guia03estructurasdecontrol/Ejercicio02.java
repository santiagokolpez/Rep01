    /* Crear un programa que pida una frase y si esa frase es igual a “eureka” 
        el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
        Nota: investigar la función equals() en Java. */
package guia03estructurasdecontrol;

import java.util.Scanner;


public class Ejercicio02 {
    public static void main(String[] args) {
       
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase = leer.next();
        
       if (frase.equals("eureka")) {   
           System.out.println("Correcto");
       }  else {  //sino
           System.out.println("Incorrecto");
       }
           
    }
}

