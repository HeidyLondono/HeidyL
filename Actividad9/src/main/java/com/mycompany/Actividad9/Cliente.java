/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Actividad9;

/**
 *
 * @author heilondo
 */
import java.util.ArrayList;
import java.util.Collections;

import java.time.LocalDate;

public class Cliente implements Comparable<Cliente> {
    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;

    public Cliente(String nombre, String direccion, String telefono, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int compareTo(Cliente otroCliente) {
        return this.nombre.compareTo(otroCliente.nombre);
    }

    // Métodos 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Telefono='" + telefono + '\'' +
                ", FechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
