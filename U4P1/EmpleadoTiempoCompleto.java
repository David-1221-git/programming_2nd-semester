package Acti2;

/**
 * Clase que representa a un empleado con contrato de tiempo completo.
 * Recibe un salario fijo mensual independiente de horas o ventas.
 */
class EmpleadoTiempoCompleto extends Empleado {
    double salarioMensual; // Salario fijo que recibe cada mes

    /**
     * Constructor para empleados de tiempo completo.
     */
    EmpleadoTiempoCompleto(String nombre, double salarioMensual, String tipo) {
        super(nombre); // Inicializa el nombre en la clase padre
        this.salarioMensual = salarioMensual;
        tipoEmpleado(tipo); // Establece el tipo de empleado
    }

    /**
     * Devuelve directamente el salario mensual pactado.
     */
    @Override
    double calcularSalario() {
        return salarioMensual;
    }
}