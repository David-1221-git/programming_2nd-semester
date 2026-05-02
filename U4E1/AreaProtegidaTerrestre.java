package U4E1;

class AreaProtegidaTerrestre extends AreaProtegida {
    private String tipoTerreno;
    private double extensionTerreno;
    private String[] especiesProtegidas;
    private int poblacion;

    public AreaProtegidaTerrestre(String nombre, double extension, int numEspeciesAnimales,
                                  double subvencionGobierno, String nombreONG, String tipoTerreno,
                                  double extensionTerreno, String[] especiesProtegidas, int poblacion) {
        super(nombre, extension, numEspeciesAnimales, subvencionGobierno, nombreONG);
        this.tipoTerreno = tipoTerreno;
        this.extensionTerreno = extensionTerreno;
        this.especiesProtegidas = especiesProtegidas;
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return super.toString() + " (Terrestre)" +
               "\nTipo de Terreno: " + tipoTerreno +
               "\nExtensión Terreno: " + extensionTerreno + " km²" +
               "\nEspecies Protegidas: " + formatearArray(especiesProtegidas) +
               "\nPoblación: " + poblacion;
    }
}
