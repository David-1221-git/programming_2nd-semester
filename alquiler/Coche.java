package alquiler;
public class Coche extends Vehiculo_persona {
    public int plazas;
    public double precioPorPlazaDia = 1.50;


    public Coche(String matricula, int diasAlquiler) {
        super(matricula, diasAlquiler, "Ferrari");
        this.plazas = 0;
    }

    public Coche(String matricula, int diasAlquiler, int plazas) {
        super(matricula, diasAlquiler, "Ford Fiesta");
        this.plazas = plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    @Override
    public double calcularPrecio() {
        double precioBase = super.calcularPrecio();
        double precioPlazas = precioPorPlazaDia * plazas * diasAlquiler;
        return precioBase + precioPlazas;
    }
}