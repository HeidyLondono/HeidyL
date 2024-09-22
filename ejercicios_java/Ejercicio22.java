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
public class Ejercicio22 {
      public static void main(String[] args) {
        // Definir el array de números
        int[] numeros = {10, 20, 30, 40, 50};
        
        // Variable para almacenar la suma de los números
        int suma = 0;
        
        // Bucle for para sumar todos los números del array
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        // Calcular el promedio
        double promedio = (double) suma / numeros.length;
        
        // Imprimir el promedio
        System.out.println("El promedio es: " + promedio);
    }
}
