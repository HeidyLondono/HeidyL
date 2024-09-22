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
public class Ejercicio28 {
    public static void main(String[] args) {
        // Definir el array de números
        int[] numeros = {5, 2, 9, 1, 5, 6};
        
        // Bucle for para ordenar el array
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    // Intercambiar numeros[i] y numeros[j]
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        
        // Imprimir el array ordenado
        System.out.print("Array ordenado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
