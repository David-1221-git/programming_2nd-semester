package U4P2;

abstract class Vehiculo {
    // Se cambia a protected para permitir acceso controlado desde subclases si es necesario
    protected String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularCosto();

    public void mostrar() {
        System.out.println("Vehículo: " + nombre);
    }
}