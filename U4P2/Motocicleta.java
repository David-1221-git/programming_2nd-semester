package U4P2;

class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String nombre, int cilindrada) {
        super(nombre);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCosto() {
        return cilindrada * 0.8;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("  Tipo: Moto | Cilindrada: " + cilindrada + " cc");
    }
}