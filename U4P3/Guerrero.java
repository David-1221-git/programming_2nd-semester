package U4P3;

class Guerrero implements Personaje {
    private String nombre;
    private int nivelEnergia;
    private String arma;

    public Guerrero(String nombre, String arma, int nivelEnergia) {
        this.nombre = nombre;
        this.arma = arma;
        this.nivelEnergia = nivelEnergia;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNivelEnergia() {
        return nivelEnergia;
    }

    @Override
    public void alimentarse(int cantidadEnergia) {
        this.nivelEnergia += cantidadEnergia;
    }

    public String combatir(int energiaGastada) {
        this.nivelEnergia -= energiaGastada;
        return arma + " " + energiaGastada;
    }
}