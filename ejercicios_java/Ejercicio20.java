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
public class Ejercicio20 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // Array de números
        int numeroBuscado = 3; // Número a buscar
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                break; // Salir del bucle si se encuentra el número
            }
        }

        if (encontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}

