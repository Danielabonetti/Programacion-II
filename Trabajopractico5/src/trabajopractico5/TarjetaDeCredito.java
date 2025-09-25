/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

import java.time.LocalDate;

/**
 *
 * @author Daniela Bonetti
 */
public class TarjetaDeCredito {
    
    private int numero;
    private LocalDate fechaVencimiento;
    
    private Cliente cliente; // asociación bidireccional
    private Banco banco; // agregación
    
    public TarjetaDeCredito(int numero, LocalDate fechaVencimiento, Cliente cliente, Banco banco){
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

  @Override
public String toString() {
    return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", clienteNombre=" + cliente.getNombre() + ", banco=" + banco + '}';
    // Mostramos solo nombre del cliente
}

    
}
