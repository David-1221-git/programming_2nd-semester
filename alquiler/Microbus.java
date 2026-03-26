package alquiler;
public class Microbus extends Vehiculo_persona {
    public double precioFijoPorPlaza = 2.00;
    public int plazas;

    public Microbus(String matricula, int diasAlquiler) {
        super(matricula, diasAlquiler, "Microbus");
    }

    public Microbus(String matricula, int diasAlquiler, int plazas) {
        super(matricula, diasAlquiler, "Microbus");
        this.plazas = plazas;
    }

    @Override
    public double calcularPrecio() {
        double precioCoche = super.calcularPrecio();
        double precioFijo = precioFijoPorPlaza * plazas;
        return precioCoche + precioFijo;
    }

    @Override
    public String informacion() {
        return super.informacion().replace("Coche", "Microbus");
    }
}