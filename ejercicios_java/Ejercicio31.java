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
public class Ejercicio31 {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 2, 8, 6, 4, 7, 5};
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero > mayor) {
                segundoMayor = mayor;
                mayor = numero;
            } else if (numero > segundoMayor && numero != mayor) {
                segundoMayor = numero;
            }
        }

        System.out.println("El segundo número más grande es: " + segundoMayor);
    }
}
