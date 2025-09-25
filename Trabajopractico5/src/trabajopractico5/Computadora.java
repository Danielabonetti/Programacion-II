/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author Daniela Bonetti
 */
public class Computadora {
    
    private String marca;
    private String numeroSerie;
    
    private PlacaMadre placa; // composición
    private Propietario propietario; // asociación bidireccional
    
    public Computadora(String marca, String numeroSerie, PlacaMadre placa, Propietario propietario){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = placa;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    public void setPlaca(PlacaMadre placa) {
        this.placa = placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

   @Override
public String toString() {
    return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placa=" + placa + ", propietarioNombre=" + propietario.getNombre() + '}';
    // Mostramos solo nombre del propietario
}

    
}
