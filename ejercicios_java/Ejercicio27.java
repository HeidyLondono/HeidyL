/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;
import java.util.ArrayList;

/**
 *
 * @author heilondo
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        // Definir el array de números
        int[] numeros = {10, 55, 23, 67, 45, 89, 12, 50, 100};
        
        // Crear una lista para almacenar los números mayores a 50
        ArrayList<Integer> mayoresA50 = new ArrayList<>();
        
        // Bucle for para filtrar los números mayores a 50
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 50) {
                mayoresA50.add(numeros[i]);
            }
        }
        
        // Convertir la lista a un array
        int[] resultado = new int[mayoresA50.size()];
        for (int i = 0; i < mayoresA50.size(); i++) {
            resultado[i] = mayoresA50.get(i);
        }
        
        // Imprimir el array de números mayores a 50
        System.out.print("Números mayores a 50: ");
        for (int numero : resultado) {
            System.out.print(numero + " ");
        }
    }
}

