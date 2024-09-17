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
public class Ejercicio15 {
    public static void main(String[] args) {
        // Definir el array de números
        int[] numeros = {5, 12, 7, 18, 3, 25, 9, 14};

        // Utilizar un bucle for para imprimir los elementos en orden inverso
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
