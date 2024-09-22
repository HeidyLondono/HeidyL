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
public class Ejercicio12 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int mayor = numeros;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número más grande en el array es: " + mayor);
    }
}
