/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 *
 * @author Daniela Bonetti
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) resultado.add(p);
        }
        return resultado;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        Optional<Producto> opt = productos.stream().max(Comparator.comparingInt(Producto::getCantidad));
        return opt.orElse(null);
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> res = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) res.add(p);
        }
        return res;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }
}

