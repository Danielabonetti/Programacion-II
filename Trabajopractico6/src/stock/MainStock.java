/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stock;

/**
 *
 * @author Daniela Bonetti
 */


import java.util.List;

public class MainStock {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1) Crear al menos cinco productos y agregarlos
        inv.agregarProducto(new Producto("P001","Arroz",1200.0, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002","Auriculares",4500.0, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P003","Remera",2200.0, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P004","Cafetera",8000.0, 5, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005","Fideo",900.0, 80, CategoriaProducto.ALIMENTOS));

        // 2) Listar productos
        System.out.println("== Todos los productos ==");
        inv.listarProductos();

        // 3) Buscar por ID
        System.out.println("\n== Buscar P002 ==");
        Producto busc = inv.buscarProductoPorId("P002");
        if (busc != null) busc.mostrarInfo();

        // 4) Filtrar por categoria
        System.out.println("\n== Filtrar ALIMENTOS ==");
        List<Producto> alimentos = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        alimentos.forEach(Producto::mostrarInfo);

        // 5) Eliminar producto
        System.out.println("\n== Eliminar P005 ==");
        inv.eliminarProducto("P005");
        inv.listarProductos();

        // 6) Actualizar stock
        System.out.println("\n== Actualizar stock P003 ==");
        inv.actualizarStock("P003", 45);
        Producto p003 = inv.buscarProductoPorId("P003");
        if (p003 != null) p003.mostrarInfo();

        // 7) Total de stock
        System.out.println("\n== Total de stock disponible = " + inv.obtenerTotalStock());

        // 8) Producto con mayor stock
        System.out.println("\n== Producto con mayor stock ==");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9) Filtrar por precio entre 1000 y 3000
        System.out.println("\n== Productos entre $1000 y $3000 ==");
        List<Producto> rango = inv.filtrarProductosPorPrecio(1000, 3000);
        rango.forEach(Producto::mostrarInfo);

        // 10) Mostrar categorias disponibles
        System.out.println("\n== Categorias disponibles ==");
        inv.mostrarCategoriasDisponibles();
    }
}


