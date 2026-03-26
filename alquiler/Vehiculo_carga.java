package alquiler;

public class Vehiculo_carga extends Vehiculo {
    public double capacidadCarga;
    public double precioPorToneladaDia = 10.00;

    public Vehiculo_carga() {
        super();
        this.capacidadCarga = 0.0;
    }

    public Vehiculo_carga(String matricula, int diasAlquiler, double capacidadCarga) {
        super(matricula, diasAlquiler, "Furgoneta de Carga");
        this.capacidadCarga = capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public double calcularPrecio() {
        double precioBase = super.calcularPrecio();
        double precioCarga = precioPorToneladaDia * capacidadCarga * diasAlquiler;
        return precioBase + precioCarga;
    }

    @Override
    public String informacion() {
        return super.informacion() + " | Tipo: Vehiculo Carga | Capacidad: " + capacidadCarga + " toneladas";
    }
    
}
