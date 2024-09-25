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
public class Main {
   
    public static void main(String[] args) {
        // se crea el domicilio
        Domicilio domicilio = new Domicilio("Calle 92", "Avenida las palmas", "Estado New Yersi", 5050);

        // se crea el banco
        Banco banco = new Banco("Banco de la República", domicilio);

        // Crear un cliente
        Cliente cliente = new Cliente("100", "Sandra Bedoya", "4444444", domicilio);

        // Agregar el cliente al banco
        banco.agregarCliente(cliente);

        // Crear una cuenta de cheques
        CuentaCheques cuentaCheques = new CuentaCheques(1, "12 de septiembre del 2024", 0.2, 5.1);

        // Agregar la cuenta al cliente
        cliente.agregarCuenta(cuentaCheques);

        // Listar clientes del banco
        banco.listarClientes();

        // Mostrar detalles de la cuenta
        System.out.println(cuentaCheques.toString());

        // Cobrar comisión mensual
        cuentaCheques.cobrarComision();

        // Mostrar detalles de la cuenta después de cobrar la comisión
        System.out.println(cuentaCheques.toString());
    }
}
