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
public class Ejercicio38 {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matriz2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int filas1 = matriz1.length;
        int columnas1 = matriz1.length;
        int columnas2 = matriz2.length;

        int[][] producto = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    producto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("El producto de las matrices es:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
