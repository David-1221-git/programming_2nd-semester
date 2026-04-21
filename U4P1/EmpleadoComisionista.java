package Acti2;

/**
 * Clase que representa a un empleado cuyo ingreso depende de un salario fijo 
 * más una comisión basada en sus ventas.
 */
class EmpleadoComisionista extends Empleado {
    double salarioBase; // Salario fijo garantizado
    double ventas;      // Monto total de ventas realizadas en el periodo
    double porcentaje;  // Porcentaje de comisión (ej: 0.15 equivale al 15%)

    /**
     * Constructor que inicializa todos los datos necesarios para un comisionista.
     */
    EmpleadoComisionista(String nombre, double salarioBase, double ventas, double porcentaje, String tipo) {
        super(nombre); // Llama al constructor de la clase padre para asignar el nombre
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentaje = porcentaje;
        tipoEmpleado(tipo); // Asigna la categoría del empleado
    }

    /**
     * Calcula el salario total: salario base + (ventas × porcentaje de comisión).
     */
    @Override
    double calcularSalario() {
        return salarioBase + (ventas * porcentaje);
    }
}