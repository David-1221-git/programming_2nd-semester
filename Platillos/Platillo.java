package Platillos;

public class Platillo {

    String nombre;
    double precio;
    boolean esPicante;


    public Platillo() {
        this("Pescuesos de pollo", 20.0, false);
    }


    public Platillo(String nombre, double precio) {
        this(nombre, precio, false);
    }

    public Platillo(String nombre, double precio, boolean esPicante) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPicante = esPicante;
    }

    public void mostrarInfo() {
        System.out.println("Platillo: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("¿Es picante?: " + (esPicante ? "Sí" : "No"));
        System.out.println("-------------------------");
    }
}