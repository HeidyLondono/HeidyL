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
public class Ejercicio36 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;

        while (contador < 10) {
            if (esPerfecto(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public static boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
}
