package U4E2;

class CocineroInternacional extends Cocinero {
    private int dificultadTecnica;
    private boolean ingredientesExoticos;

    public CocineroInternacional(String nombre, String platillo, double puntosBase, int dificultadTecnica, boolean ingredientesExoticos) {
        super(nombre, platillo, puntosBase);
        this.dificultadTecnica = dificultadTecnica;
        this.ingredientesExoticos = ingredientesExoticos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Estilo: Internacional");
        System.out.println("Dificultad técnica: " + dificultadTecnica);
        System.out.println("Ingredientes exóticos: " + (ingredientesExoticos ? "Sí" : "No"));
    }

    @Override
    public double calcularPuntajeFinal() {
        double bonificacionExotica = ingredientesExoticos ? 4 : 0;
        return puntosBase + (dificultadTecnica * 2) + bonificacionExotica;
    }
}