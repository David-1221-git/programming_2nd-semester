package alquiler;
public class Vehiculo {
    public String matricula;
    public int diasAlquiler;
    public double precioBaseDiario = 50.00;
    public String nombreVehiculo;

    public Vehiculo() {
        this.matricula = "cds-000";
        this.diasAlquiler = 0;
        this.nombreVehiculo = "Tesla";
    }

    public Vehiculo(String matricula, int diasAlquiler, String nombreVehiculo) {
        this.matricula = matricula;
        this.diasAlquiler = diasAlquiler;
        this.nombreVehiculo = nombreVehiculo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }
    public String getNombreVehiculo() {
        return nombreVehiculo;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setDiasAlquiler(int dias) {
        this.diasAlquiler = dias;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public double calcularPrecio() {
        return precioBaseDiario * diasAlquiler;
    }

    public String informacion() {
        return "Matricula: " + matricula + " | Dias: " + diasAlquiler + " | Vehiculo: " + nombreVehiculo;
    }
}