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
public class CuentadeCheque extends Cuenta{
    private double limiteSobregiro;

    // Constructor
    public CuentaCheques(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    // Métodos
    public void retirar(double cantidad) {
        if (saldo + limiteSobregiro >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente, incluso con sobregiro");
        }
    }
}
