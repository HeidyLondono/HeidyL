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
public class Ejercicios_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir el array de números
        int[] numeros = {5, 12, 7, 18, 3, 25, 9, 14};

        // Inicializar el contador
        int contador = 0;

        // Utilizar un bucle for para contar cuántos números son mayores que 10
        for (int numero : numeros) {
            if (numero > 10) {
                contador++;
            }
        }

        // Imprimir el resultado
        System.out.println("Hay " + contador + " números mayores que 10 en el array.");
    }
}
