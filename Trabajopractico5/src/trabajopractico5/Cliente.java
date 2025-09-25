/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author Daniela Bonetti
 */
public class Cliente {
    
    private String nombre;
    private int dni;
    
    private TarjetaDeCredito tarjeta; // relación bidireccional
    
    public Cliente(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
public String toString() {
    return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    // Quitamos tarjeta para evitar bucle
}

}
