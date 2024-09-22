/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_Banco;
import java.util.List;

/**
 *
 * @author heilondo
 */
public class Banco {
    private List<Cliente> clientes;
    private List<Cuenta> cuentas;

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    // Otros métodos según sea necesario
}





