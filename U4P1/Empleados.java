package Acti2;

/**
 * Clase abstracta que define la estructura base para todos los tipos de empleados.
 * Al ser abstracta, no se puede instanciar directamente y obliga a las subclases
 * a implementar su propia lógica de cálculo de salario.
 */
abstract class Empleado {
    String nombre; // Almacena el nombre del empleado
    String tipo;   // Almacena la categoría o modalidad de contratación

    /**
     * Constructor que recibe e inicializa el nombre del empleado.
     */
    Empleado(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método setter para asignar el tipo de empleado (ej: "Comisionista", "Freelance", etc.)
     */
    void tipoEmpleado(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método abstracto que define el contrato para calcular el salario.
     * Cada subclase DEBE sobrescribir este método con su propia fórmula.
     */
    abstract double calcularSalario();

    /**
     * Imprime en consola la información básica del empleado.
     */
    void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
}