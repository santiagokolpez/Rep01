/* Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma 
de los números introducidos supere el límite inicial. */
package guia03estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un límite valor límite positivo");
        int limite = leer.nextInt();
        int num = 0;
        int suma = num;
        while (suma <= limite) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            suma += num;
        }

        System.out.println("La suma " + suma + " superó el límite");
    }
}


/* EJERCICIO COPIADO DE JERE, FORTALECER EL APRENDIZAJE!!! */