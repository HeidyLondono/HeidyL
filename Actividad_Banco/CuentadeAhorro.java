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
public class CuentadeAhorro extends Cuenta{
    private double tasaInteres;

    // Constructor
    public CuentaAhorro(double saldo, double tasaInteres) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }

    // Métodos
    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}
