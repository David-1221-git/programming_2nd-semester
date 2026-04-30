package U4E2;

abstract class Cocinero {
    protected String nombre;
    protected String platillo;
    protected double puntosBase;

    public Cocinero(String nombre, String platillo, double puntosBase) {
        this.nombre = nombre;
        this.platillo = platillo;
        this.puntosBase = puntosBase;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Platillo: " + platillo);
        System.out.println("Puntos Base: " + puntosBase);
    }
    public abstract double calcularPuntajeFinal();
}
