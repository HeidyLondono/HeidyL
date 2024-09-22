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
public class Ejercicio18 {
    public static void main(String[] args) {
        String[] palabras = {"buenos días", "hermoso mundo"};
        
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = palabras[i].toUpperCase();
        }
        
        // Imprimir el array convertido
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}

