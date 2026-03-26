package cursos;

public class Curso {
    protected String nombre;
    protected int duracionHoras;
    protected double precio;

    public Curso() {
        this.nombre = "Programacion avanzada en carnitas++";
        this.duracionHoras = 76;
        this.precio = 1500.0;
    }

    public Curso(String nombres) {
        this.nombre = nombres;
        this.duracionHoras = 85;
        this.precio = 7659.0;
    }

    public Curso(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.precio = 4841.0;
    }
    public Curso(String nombre, int duracionHoras, double precio) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Informacion del Curso");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duracion: " + duracionHoras + " horas");
        System.out.println("Precio Base: $" + precio);
    }

    public double calcularCosto() {
        return this.precio;
    }

    public double calcularCosto(double descuento) {
        if (descuento < 0 || descuento > 100) {
            System.out.println("Descuento invalido.");
            return this.precio;
        }
        double precioConDescuento = this.precio - (this.precio * (descuento / 100));
        return precioConDescuento;
    }
}