/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;
import java.util.Scanner;


/**
 *
 * @author heilondo
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
