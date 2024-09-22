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
public class Ejercicio24 {
    public static void main(String[] args) {
        // Definir el array de elementos
        String[] elementos = {"Java", "es", "genial"};
        
        // Variable para almacenar el resultado de la concatenación
        StringBuilder resultado = new StringBuilder();
        
        // Bucle for para concatenar todos los elementos del array
        for (int i = 0; i < elementos.length; i++) {
            resultado.append(elementos[i]);
            // Agregar una coma después de cada elemento excepto el último
            if (i < elementos.length - 1) {
                resultado.append(", ");
            }
        }
        
        // Imprimir el resultado de la concatenación
        System.out.println("Resultado: " + resultado.toString());
    }
}
