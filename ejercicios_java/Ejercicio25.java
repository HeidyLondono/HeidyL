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
public class Ejercicio25 {
    public static void main(String[] args) {
        // Definir el número de filas de la pirámide
        int filas = 5;
        
        // Bucle for para crear la pirámide invertida
        for (int i = filas; i > 0; i--) {
            // Bucle for para imprimir los asteriscos en cada fila
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Imprimir una nueva línea después de cada fila
            System.out.println();
        }
    }
}
