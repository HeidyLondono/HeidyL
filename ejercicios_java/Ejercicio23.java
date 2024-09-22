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
public class Ejercicio23 {
     public static void main(String[] args) {
        // Definir el array con diferentes tipos de elementos
        Object[] elementos = {1, "Hola", 3.14, "Mundo", 42, "Java"};
        
        // Variable para contar los elementos de tipo String
        int contadorStrings = 0;
        
        // Bucle for para recorrer todos los elementos del array
        for (int i = 0; i < elementos.length; i++) {
            // Verificar si el elemento es de tipo String
            if (elementos[i] instanceof String) {
                contadorStrings++;
            }
        }
        
        // Imprimir el número de elementos de tipo String
        System.out.println("Número de elementos de tipo String: " + contadorStrings);
    }
}
