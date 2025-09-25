package trabajopractico5;

import java.time.LocalDate;

public class Trabajopractico5 {

    public static void main(String[] args) {
        
        // Ejercicio 1 
        Foto foto1 = new Foto("foto1", "png");
        Titular titular1 = new Titular("Juan Perez", 41258524);
        Pasaporte pasaporte1 = new Pasaporte(2, LocalDate.of(2025, 2, 24), foto1, titular1);
        titular1.setPasaporte(pasaporte1);
        System.out.println(pasaporte1);
        
        
        // Ejercicio 2 
        Bateria bateria1 = new Bateria("Samsung-01", 4500);
        Usuario usuario1 = new Usuario("Maria Lopez", 38965412);
        Celular celular1 = new Celular("123456789", "Samsung", "Galaxy S22", bateria1, usuario1);
        usuario1.setCelular(celular1);
        System.out.println(celular1);
        
        
        // Ejercicio 3 
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial1 = new Editorial("Editorial Sudamericana", "Buenos Aires");
        Libro libro1 = new Libro("Cien años de soledad", "978-987-1138-45-2", autor1, editorial1);
        System.out.println(libro1);
        
        
        // Ejercicio 4 
        Banco banco1 = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente1 = new Cliente("Luis Fernandez", 30589654);
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(456789123, LocalDate.of(2027, 6, 30), cliente1, banco1);
        cliente1.setTarjeta(tarjeta1);
        System.out.println(tarjeta1);
        
        
        //  Ejercicio 5 
        PlacaMadre placa1 = new PlacaMadre("ASUS Prime", "Z790");
        Propietario propietario1 = new Propietario("Carla Torres", 40123567);
        Computadora computadora1 = new Computadora("HP", "SN123456789", placa1, propietario1);
        propietario1.setComputadora(computadora1);
        System.out.println(computadora1);
    }
    
}
