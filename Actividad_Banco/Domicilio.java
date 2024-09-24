/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_Banco;

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
                ", colonia='" + avenida + '\'' +
                ", estado='" + estado + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
