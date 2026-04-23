package U4P3;

class Mago implements Personaje {
    private String nombre;
    private int nivelEnergia;
    private String poder;

    public Mago(String nombre, String poder) {
        this.nombre = nombre;
        this.poder = poder;
        this.nivelEnergia = 100; 
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

    public String encantar() {
        this.nivelEnergia -= 2;
        return poder;
    }
}