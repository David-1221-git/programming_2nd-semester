package Acti2;

/**
 * Clase que representa a un empleado remunerado por horas trabajadas.
 * Su salario varía según la cantidad de horas y la tarifa por hora.
 */
class EmpleadoPorHoras extends Empleado {
    int horas;          // Número total de horas trabajadas
    double pagoPorHora; // Valor monetario por cada hora trabajada

    /**
     * Constructor para empleados por horas.
     */
    EmpleadoPorHoras(String nombre, int horas, double pagoPorHora, String tipo) {
        super(nombre); // Llama al constructor de la clase Empleado
        this.horas = horas;
        this.pagoPorHora = pagoPorHora;
        tipoEmpleado(tipo); // Asigna la categoría laboral
    }

    /**
     * Calcula el salario multiplicando las horas trabajadas por la tarifa por hora.
     */
    @Override
    double calcularSalario() {
        return horas * pagoPorHora;
    }
}