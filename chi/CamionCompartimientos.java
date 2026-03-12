package chi;
public class CamionCompartimientos extends Camion {
    public int compartimientos = 1;

    public void setCompartimientos(int c) {
        compartimientos = c;
    }

    public int getCompartimientos() {
        return compartimientos;
    }

    public int CargaCompartimiento() {
        return carga / compartimientos;
    }

    public String Descripcion() {
        return marca + " - Compartimientos: " + compartimientos;
    }
}