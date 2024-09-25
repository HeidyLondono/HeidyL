/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.Actividad9;

/**
 *
 * @author heilondo
 */
public interface ServicioClientes {
    void agregarCuenta(Cuenta cuenta);
    void eliminarCuenta(int numero);
    Cuenta buscarCuenta(int numero);
}

