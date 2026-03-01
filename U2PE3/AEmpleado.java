package U2PE3;
/*Codigo: U2PE3. Salarios
Por: Merino Dominguez David */
import java.util.Scanner;

public class AEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de calculo de salarios\n");

        System.out.print("Cuantos empleados desea registrar.- ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine();

        Empleado[] empleados = new Empleado[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("\nEmpleado " + (i + 1) + " .-");
            System.out.print("Ingrese nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese horas trabajadas: ");
            int horas = scanner.nextInt();
            scanner.nextLine();

            empleados[i] = new Empleado(nombre, horas);
            empleados[i].calcularSSB();
            empleados[i].calcularISTP();
        }

        System.out.println("\n\nEste es el reporte de salarios de los empleados registrados.-\n");

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado " + (i + 1) + ".-");
            System.out.printf("Nombre: %s\n", empleados[i].getNombre());
            System.out.printf("Horas Trabajadas: %d\n", empleados[i].getHorasTrabajadas());
            System.out.printf("Salario Semanal Bruto: $%.2f\n", empleados[i].getSalarioSemanaBruto());
            System.out.printf("Descuento IMSS (5%%): $%.2f\n", empleados[i].getDescuentoIMSS());
            System.out.printf("Descuento ISPT: $%.2f\n", empleados[i].getDescuentoISPT());
            System.out.printf("Salario Semanal Neto: $%.2f\n", empleados[i].getSalarioSemanaNeto());
            System.out.println("---------------------------\n");
        }

        scanner.close();
    }
}