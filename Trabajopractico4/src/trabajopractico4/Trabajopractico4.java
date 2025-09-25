package trabajopractico4;

public class Trabajopractico4 {

    public static void main(String[] args) {

        // Creo empleados usando ambos constructores
        Empleado empleado1 = new Empleado(1, "Ezequiel", "Operario", 1500);
        Empleado empleado2 = new Empleado(2, "Juan", "Jefe", 50000);
        Empleado empleado3 = new Empleado("Pepito", "Operario"); 

        // Muestro los nombres
        System.out.println("Empleado 1: " + empleado1.getNombre());
        System.out.println("Empleado 2: " + empleado2.getNombre());
        System.out.println("Empleado 3: " + empleado3.getNombre());

        // Actualizo salarios usando métodos sobrecargados
        System.out.println("\n--- Actualización de salarios ---");
        System.out.println("Salario antes del aumento empleado1: " + empleado1.getSalario());
        empleado1.actualizarSalario(10); // aumento por porcentaje
        System.out.println("Salario después del aumento empleado1: " + empleado1.getSalario());

        empleado2.actualizarSalario(2000); // aumento fijo
        System.out.println("Salario empleado2 después del aumento fijo: " + empleado2.getSalario());

        // Muestro info de cada empleado usando toString()
        System.out.println("\n--- Información completa de empleados ---");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        // Muestro total de empleados creados
        System.out.println("\n--- Total empleados ---");
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
