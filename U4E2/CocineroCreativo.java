package U4E2;

class CocineroCreativo extends Cocinero {
    private int nivelInnovacion;

    public CocineroCreativo(String nombre, String platillo, double puntosBase, int nivelInnovacion) {
        super(nombre, platillo, puntosBase);
        this.nivelInnovacion = nivelInnovacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Estilo: Creativo");
        System.out.println("Nivel de innovación: " + nivelInnovacion);
    }

    @Override
    public double calcularPuntajeFinal() {
        return puntosBase + (nivelInnovacion * 0.7);
    }
}