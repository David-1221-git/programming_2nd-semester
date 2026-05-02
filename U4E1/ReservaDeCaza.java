package U4E1;
class ReservaDeCaza extends Parque implements Cazable {
    private double costeLicencia;
    private String tipoArma;
    private String[] mesesCaza;
    private String especieCazada;
    private int cantidadEspecimenes;

    public ReservaDeCaza(String nombre, double extension, int numEspeciesAnimales,
                         double costeLicencia, String tipoArma, String[] mesesCaza,
                         String especieCazada, int cantidadEspecimenes) {
        super(nombre, extension, numEspeciesAnimales);
        this.costeLicencia = costeLicencia;
        this.tipoArma = tipoArma;
        this.mesesCaza = mesesCaza;
        this.especieCazada = especieCazada;
        this.cantidadEspecimenes = cantidadEspecimenes;
    }

    @Override public String[] getMesesCaza() { return mesesCaza; }
    @Override public String getTipoArma() { return tipoArma; }
    @Override public String getEspecieCazada() { return especieCazada; }
    @Override public int getCantidadEspecimenes() { return cantidadEspecimenes; }
    @Override public String getNombreParque() { return super.getNombre(); }

    @Override
    public String toString() {
        return super.toString() + 
               "\nTipo: Reserva de Caza" +
               "\nCoste Licencia: " + costeLicencia + " KES" +
               "\nTipo de Arma: " + tipoArma +
               "\nMeses de Caza:" + formatearArray(mesesCaza) +
               "\nEspecie Cazada: " + especieCazada +
               "\nCantidad Especímenes: " + cantidadEspecimenes;
    }
}