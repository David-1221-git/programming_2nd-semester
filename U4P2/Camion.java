package U4P2;


class Camion extends Vehiculo {
    private int carga;

    public Camion(String nombre, int carga) {
        super(nombre);
        this.carga = carga;
    }

    // [ERROR 3] La clase Camion extiende Vehiculo pero NO implementa el método abstracto calcularCosto().
    // Java exige que toda clase concreta (no abstracta) implemente TODOS los métodos abstractos heredados.
    // Si no se implementa, el compilador arroja: "error: Camion is not abstract and does not override abstract method".
    // [CORRECCIÓN] Se implementa el método con una lógica acorde al atributo carga.
    @Override
    public double calcularCosto() {
        return carga * 3.5; // Costo ejemplo basado en carga
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("  Tipo: Camión | Carga: " + carga + " kg");
    }
}