package U2PE3;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double salarioSemanaBruto;
    private double salarioSemanaNeto;
    private double descuentoIMSS;
    private double descuentoISPT;

    public static final double TARIFA_HORA_NORMAL = 70.0;
    public static final double TARIFA_HORA_EXTRA = 85.0;
    public static final int HORAS_NORMALES = 40;
    public static final double PORCENTAJE_IMSS = 0.05;

    public Empleado() {
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.salarioSemanaBruto = 0;
        this.salarioSemanaNeto = 0;
        this.descuentoIMSS = 0;
        this.descuentoISPT = 0;
    }

    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.salarioSemanaBruto = 0;
        this.salarioSemanaNeto = 0;
        this.descuentoIMSS = 0;
        this.descuentoISPT = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getSalarioSemanaBruto() {
        return salarioSemanaBruto;
    }

    public double getSalarioSemanaNeto() {
        return salarioSemanaNeto;
    }

    public double getDescuentoIMSS() {
        return descuentoIMSS;
    }

    public double getDescuentoISPT() {
        return descuentoISPT;
    }

    public void calcularSSB() {
        if (this.horasTrabajadas <= HORAS_NORMALES) {
            this.salarioSemanaBruto = this.horasTrabajadas * TARIFA_HORA_NORMAL;
        } else {
            double horasNormales = HORAS_NORMALES * TARIFA_HORA_NORMAL;
            double horasExtras = (this.horasTrabajadas - HORAS_NORMALES) * TARIFA_HORA_EXTRA;
            this.salarioSemanaBruto = horasNormales + horasExtras;
        }
    }

    public void calcularISTP() {
        this.descuentoIMSS = this.salarioSemanaBruto * PORCENTAJE_IMSS;
        this.descuentoISPT = Empleado.descuento(this.salarioSemanaBruto);
        this.salarioSemanaNeto = this.salarioSemanaBruto - this.descuentoIMSS - this.descuentoISPT;
    }

    public static double descuento(double ssb) {
        if (ssb < 2000) {
            return 0;
        } else if (ssb >= 2001 && ssb <= 5000) {
            return ssb * 0.03;
        } else {
            return ssb * 0.05;
        }
    }

    public String toString() {
        return String.format("Nombre: %s\nHoras Trabajadas: %d\nSalario Bruto: $%.2f\nDescuento IMSS: $%.2f\nDescuento ISPT: $%.2f\nSalario Neto: $%.2f",
                nombre, horasTrabajadas, salarioSemanaBruto, descuentoIMSS, descuentoISPT, salarioSemanaNeto);
    }
}