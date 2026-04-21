package Acti2;

/**
 * Clase principal que contiene el punto de entrada del programa.
 * Demuestra el uso de herencia y polimorfismo para gestionar diferentes 
 * tipos de empleados de forma unificada.
 */
public class Main {

    /**
     * Método main: punto de inicio de la ejecución.
     * Se encarga de crear, almacenar y procesar la nómina de empleados.
     */
    public static void main(String[] args) {
        
        // 1. Creación de un arreglo polimórfico
        // Gracias a la herencia, el arreglo de tipo Empleado puede almacenar 
        // cualquier subclase que herede de Empleado.
        Empleado[] empleados = new Empleado[4];

        // 2. Instanciación y asignación de empleados concretos
        // Cada posición recibe un objeto de una subclase diferente
        empleados[0] = new EmpleadoTiempoCompleto("Ana ", 12000, "Tiempo Completo ");
        empleados[1] = new EmpleadoPorHoras("Luis ", 40, 100, "Por Horas ");
        empleados[2] = new EmpleadoComisionista("Carlos ", 5000, 20000, 0.1, "Comisionista ");
        empleados[3] = new EmpleadoFreelance("Favian ", 676767, 67, "Freelance ");

        // 3. Recorrido del arreglo usando un bucle mejorado (foreach)
        for (Empleado e : empleados) {
            // Llama al método heredado que imprime nombre y tipo
            e.mostrarDatos();
            
            // 🔑 POLIMORFISMO EN ACCIÓN:
            // Aunque la variable 'e' es de tipo Empleado, Java determina en 
            // tiempo de ejecución qué versión de calcularSalario() ejecutar 
            // según la clase real del objeto (TiempoCompleto, PorHoras, etc.)
            System.out.println("Salario: " + e.calcularSalario());
            
            // Separador visual para mejor legibilidad en consola
            System.out.println("---------------------");
        }
    }
}