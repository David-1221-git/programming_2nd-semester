package U4E1;

class AreaProtegidaAcuatica extends AreaProtegida {
    private int numLagos;
    private double extensionLago;
    private String nombreLago;
    private String especieProtegida;

    public AreaProtegidaAcuatica(String nombre, double extension, int numEspeciesAnimales,
                                 double subvencionGobierno, String nombreONG, int numLagos,
                                 double extensionLago, String nombreLago, String especieProtegida) {
        super(nombre, extension, numEspeciesAnimales, subvencionGobierno, nombreONG);
        this.numLagos = numLagos;
        this.extensionLago = extensionLago;
        this.nombreLago = nombreLago;
        this.especieProtegida = especieProtegida;
    }

    @Override
    public String toString() {
        return super.toString() + " (Acuática)" +
               "\nNº Lagos: " + numLagos +
               "\nExtensión por Lago: " + extensionLago + " km²" +
               "\nNombre del Lago: " + nombreLago +
               "\nEspecie Protegida: " + especieProtegida;
    }
}
