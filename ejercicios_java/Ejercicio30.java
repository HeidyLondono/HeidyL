/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

/**
 *
 * @author heilondo
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        // Definir el array de números o letras
        char[] array = {'a', 'b', 'c', 'b', 'a'};
        
        // Variable para almacenar el resultado de la verificación
        boolean esPalindromo = true;
        
        // Bucle for para verificar si el array es un palíndromo
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }
        
        // Imprimir el resultado
        if (esPalindromo) {
            System.out.println("El array es un palíndromo.");
        } else {
            System.out.println("El array no es un palíndromo.");
        }
    }
}
