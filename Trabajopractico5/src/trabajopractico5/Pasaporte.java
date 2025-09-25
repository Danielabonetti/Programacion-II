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
public class Pasaporte {
    
    private int numero;
    private LocalDate fechaEmision;
    
    private Foto foto;
    private Titular titular;
    
    public Pasaporte (int numero, LocalDate fechaEmision, Foto foto, Titular titular){
    this.numero=numero;
    this.fechaEmision=fechaEmision;
    this.foto=foto;
    this.titular=titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

  @Override
public String toString() {
    return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titularNombre=" + titular.getNombre() + '}';
 
}

    
}


