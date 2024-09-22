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
public class Ejercicio16 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        int count = 10; // Número de elementos a imprimir

        System.out.print(n1 + " " + n2); // Imprime los primeros dos números

        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
