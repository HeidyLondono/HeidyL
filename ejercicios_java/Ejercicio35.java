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
public class Ejercicio35 {
    public static void main(String[] args) {
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos.add(i);
            }
        }

        // Convertir ArrayList a array
        int[] arrayPrimos = primos.stream().mapToInt(Integer::intValue).toArray();

        // Imprimir los números primos
        System.out.println("Números primos entre 1 y 100:");
        for (int primo : arrayPrimos) {
            System.out.print(primo + " ");
        }
    }
}
