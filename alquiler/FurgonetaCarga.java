package alquiler;
public class FurgonetaCarga extends Vehiculo_carga {
    public double pma;
    public double precioPorPMA = 20.00;

    public FurgonetaCarga() {
        super();
        this.pma = 0;
    }

    public FurgonetaCarga(String matricula, int diasAlquiler, double pma, String nombreVehiculo) {
        super(matricula, diasAlquiler, 0.0); 
        this.pma = pma;
    }

    public FurgonetaCarga(String matricula, int diasAlquiler, double pma) {
        super(matricula, diasAlquiler, 0.0);
        this.pma = pma;
    }

    public void setPma(double pma) {
        this.pma = pma;
    }

    public double getPma() {
        return pma;
    }

    @Override
    public double calcularPrecio() {
        double precioBase = super.calcularPrecio();
        double precioPma = precioPorPMA * pma;
        return precioBase + precioPma;
    }

}