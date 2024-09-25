/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Actividad9;

/**
 *
 * @author heilondo
 */
public class Domicilio {
    private String calle;
    private String avenida;
    private String estado;
    private int codigoPostal;

    public Domicilio(String calle, String avenida, String estado, int codigoPostal) {
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", avenida='" + avenida + '\'' +
                ", estado='" + estado + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
