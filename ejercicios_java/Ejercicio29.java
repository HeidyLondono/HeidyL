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
public class Ejercicio29 {
     public static void main(String[] args) {
        // Definir la matriz 2D de entrada
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Obtener el número de filas y columnas de la matriz original
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        // Crear una nueva matriz para almacenar la transpuesta
        int[][] transpuesta = new int[columnas][filas];
        
        // Bucle for para calcular la transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        // Imprimir la matriz transpuesta
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
