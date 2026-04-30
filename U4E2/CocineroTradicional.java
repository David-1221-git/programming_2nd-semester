package U4E2;

class CocineroTradicional extends Cocinero {
    private int tiempoPreparacion;

    public CocineroTradicional(String nombre, String platillo, double puntosBase, int tiempoPreparacion) {
        super(nombre, platillo, puntosBase);
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Estilo: Tradicional");
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " min");
    }

    @Override
    public double calcularPuntajeFinal() {
        return tiempoPreparacion < 60 ? puntosBase + 5 : puntosBase - 3;
    }
}
