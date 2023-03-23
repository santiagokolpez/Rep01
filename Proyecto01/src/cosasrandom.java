
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class cosasrandom {
    public static void main(String[] args) {
        
  Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase a modificar");
        frase(leer.nextLine());
    }

    public static void frase(String palabra) {
        String cambiada = "";
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                    cambiada += "@";
                    break;
                case "e":
                   cambiada += "#";
                    break;
                case "i":
                    cambiada += "$";
                    break;
                case "o":
                    cambiada += "%";
                    break;
                case "u":
                    cambiada += "*";
                    break;
                default:
                    cambiada += palabra.substring(i, i + 1);
            }
        }
    System.out.println("La palabra cambiada es: " + cambiada);
    }
}
    
