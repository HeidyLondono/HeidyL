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
public class Ejercicio21 {
      public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Array de ejemplo

        for (int i = 1; i < numeros.length; i += 2) {
            System.out.println(numeros[i]);
        }
    }
}
