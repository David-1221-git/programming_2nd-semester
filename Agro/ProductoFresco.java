package Agro;

public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("*****Tipo: Producto Fresco*****");
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("Pais de Origen: " + paisOrigen);
        System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII\n");
    }
}
