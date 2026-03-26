package Agro;
public class ProductoRefrigerado extends Producto {
    private String codigoOrganismoSupervision;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismoSupervision = codigoOrganismo;
    }

    public String getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }

    public void setCodigoOrganismoSupervision(String codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("*****Tipo: Producto Refrigerado*****");
        System.out.println("Codigo Organismo Supervision: " + codigoOrganismoSupervision);
        System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII\n");
    }
}