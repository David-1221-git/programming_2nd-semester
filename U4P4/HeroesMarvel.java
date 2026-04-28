package U4P4;

public class HeroesMarvel extends Superheroes implements Pelear, Volar {
    private String identidad;
    private String alias;
    private String poder;
    private String mundo;
    private String raza;
    private String arma;
    private String traje;


    public HeroesMarvel(String identidad, String alias, String poder, String mundo, String raza, String arma, String traje) {
        this.identidad = identidad;
        this.alias = alias;
        this.poder = poder;
        this.mundo = mundo;
        this.raza = raza;
        this.arma = arma;
        this.traje = traje;
    }

    @Override
    public String getIdentidad() {
        return identidad;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public String getPoder() {
        return poder;
    }

    @Override
    public String getMundo() {
        return mundo;
    }

    @Override
    public String getRaza() {
        return raza;
    }

    @Override
    public String getArma() {
        return arma;
    }

    @Override
    public String getTraje() {
        return traje;
    }

    @Override
    public void pelear(String tecnica, int daño) {
        System.out.println(alias + " está peleando con la técnica: " + tecnica + " y ha causado un daño de: " + daño);
    }

    @Override
    public void volar(String tecnica) {
        System.out.println(alias + " está volando con la técnica: " + tecnica);
    }

}
