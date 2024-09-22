/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejerciciovector_heidy;

/**
 *
 * @author Heidy Londoño
 */
/**
 */
public class EjercicioVector_Heidy {

    public static void main(String[] args) {
        
        // Incrementador
        int multiplicador = 4;
        
        // Crear un arreglo de 5 posiciones
        int[] arregloNum = new int[5];
        
        // Inicializar el arreglo con valores
        for (int i = 0; i < 5; i++) {
            arregloNum[i] = i * multiplicador; // Asigna valores como [0, 4, 8, 12, 16]
        }
        // Imprimir los valores del arreglo
        System.out.println("Contenido del arreglo:");
        System.out.println("----------------------");
        int index = 0;
        for (int num : arregloNum) {
            System.out.println("Posicion " + index + " :: " + num);
            index++;
        }
    }
}

