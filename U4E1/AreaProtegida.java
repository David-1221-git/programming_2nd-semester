package U4E1;


class AreaProtegida extends Parque implements Visitable {
    protected double subvencionGobierno; 
    protected String nombreONG;

    public AreaProtegida(String nombre, double extension, int numEspeciesAnimales,
                         double subvencionGobierno, String nombreONG) {
        super(nombre, extension, numEspeciesAnimales);
        this.subvencionGobierno = subvencionGobierno;
        this.nombreONG = nombreONG;
    }

    @Override
    public String visitar() {
        return "Visitando área protegida " + this.nombre;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nTipo: Área Protegida" +
               "\nSubvención Gobierno: " + subvencionGobierno + " KES" +
               "\nONG Colaboradora: " + nombreONG;
    }
}