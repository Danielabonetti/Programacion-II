package trabajopractico4;

/**
 *
 * @author Daniela Bonetti
 */

public class Empleado {

    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para contar total de empleados
    private static int totalEmpleados = 0;

    // Constructor completo: recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // incremento total de empleados
    }

    // Constructor sobrecargado: recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000; // salario por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados actualizarSalario
    // Aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    // Aumento fijo
    public void actualizarSalario(int aumentoFijo) {
        salario += aumentoFijo;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString() para mostrar info completa
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
