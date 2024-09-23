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
public class Cuenta {
    protected double saldo;

    // Constructor
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    // Métodos
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
