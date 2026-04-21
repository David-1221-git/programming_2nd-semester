package Acti2;

/**
 * Clase que representa a un trabajador freelance o por proyectos.
 * Su ingreso depende de cuántos proyectos complete y cuánto se paga por cada uno.
 */
class EmpleadoFreelance extends Empleado {
    double tarifaPorProyecto;    // Pago acordado por cada proyecto entregado
    int proyectosCompletados;    // Cantidad de proyectos finalizados en el periodo

    /**
     * Constructor para empleados freelance.
     */
    EmpleadoFreelance(String nombre, double tarifaPorProyecto, int proyectosCompletados, String tipo) {
        super(nombre); // Inicializa el nombre desde la clase padre
        this.tarifaPorProyecto = tarifaPorProyecto;
        this.proyectosCompletados = proyectosCompletados;
        tipoEmpleado(tipo); // Establece la modalidad de trabajo
    }

    /**
     * Calcula el salario multiplicando la tarifa por proyecto y la cantidad completada.
     */
    @Override
    double calcularSalario() {
        return tarifaPorProyecto * proyectosCompletados;
    }
}