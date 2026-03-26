package alquiler;
public class Camion extends Vehiculo_carga {
    public double precioFijoCamion = 40.00;

    public Camion() {
        super();
    }

    public Camion(String matricula, int diasAlquiler,String nombreVehiculo) {
        super(matricula, diasAlquiler, 0.0);
        this.nombreVehiculo = nombreVehiculo;
    }

    public Camion(String matricula, int diasAlquiler, double pma) {
        super(matricula, diasAlquiler, pma);
    }

    @Override
    public double calcularPrecio() {
        double precioFurgoneta = super.calcularPrecio();
        return precioFurgoneta + precioFijoCamion;
    }


}