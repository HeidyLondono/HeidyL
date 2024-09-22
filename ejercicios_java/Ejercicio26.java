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
public class Ejercicio26 {
    public static void main(String[] args) {
        // Definir el array de strings que representan números
        String[] strings = {"1", "2", "3", "4", "5"};
        
        // Crear un array de enteros con la misma longitud
        int[] numeros = new int[strings.length];
        
        // Bucle for para convertir cada string en un número entero
        for (int i = 0; i < strings.length; i++) {
            numeros[i] = Integer.parseInt(strings[i]);
        }
        
        // Imprimir el array de números
        System.out.print("Array de números: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
