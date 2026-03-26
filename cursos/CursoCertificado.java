package cursos;

public class CursoCertificado extends Curso {
    private String institucion;
    private boolean incluyeCertificado;

    public CursoCertificado(String nombre, int duracionHoras, double precio, String institucion, boolean incluyeCertificado) {
        super(nombre, duracionHoras, precio);
        this.institucion = institucion;
        this.incluyeCertificado = incluyeCertificado;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Institucion: " + institucion);
        System.out.println("Incluye Certificado: " + (incluyeCertificado ? "Si" : "No"));
        System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Override
    public double calcularCosto() {
        double costoBase = super.calcularCosto();
        if (incluyeCertificado) {
            return costoBase * 1.20;
        }
        return costoBase;
    }

    public void emitirCertificado() {
        if (incluyeCertificado) {
            System.out.println("> Emitiendo certificado oficial de " + institucion + " para el curso: " + nombre);
        } else {
            System.out.println("> Este curso no genera certificado.");
        }
    }
}