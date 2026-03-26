package alquiler;

public class Vehiculo_persona extends Vehiculo {
    public double precioFijoPersona = 5.00;

    public Vehiculo_persona(String matricula, int diasAlquiler, String nombreVehiculo) {
        super(matricula, diasAlquiler, nombreVehiculo);
    }

    @Override
    public double calcularPrecio() {
        double precioBase = super.calcularPrecio();
        return precioBase + precioFijoPersona;
    }

    @Override
    public String informacion() {
        return super.informacion() + " | Tipo: Vehiculo Persona ";
    }
    
}
