/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_Banco;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author heilondo
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private List<Cuenta> cuentas;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    // Getters y setters
}
