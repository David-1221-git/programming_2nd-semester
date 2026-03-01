package U2Prob3;
/*Codigo: U2Prob3. datos persona
Por: Merino Dominguez David */
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Persona 1 ingrese todos los campos requeridos\n");

        System.out.println("Ingrese datos para la Persona 1:");
        String nombre1 = pedirString(scanner, "Nombre");
        int edad1 = pedirInt(scanner, "Edad");
        char sexo1 = pedirSexo(scanner);
        double peso1 = pedirDouble(scanner, "Peso (kg)");
        double altura1 = pedirDouble(scanner, "Altura (m)");
        String dni1 = pedirString(scanner, "DNI");

        Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1, dni1);

        System.out.println("\nIngrese datos para la Persona 2  ingrese solo los campos solisitados.-(Solo nombre, edad, sexo):");
        String nombre2 = pedirString(scanner, "Nombre");
        int edad2 = pedirInt(scanner, "Edad");
        char sexo2 = pedirSexo(scanner);

        Persona persona2 = new Persona(nombre2, edad2, sexo2);

        System.out.println("\nDatos persona 3 por defecto.-");
        Persona persona3 = new Persona();
        persona3.setNombre("David Merino");
        persona3.setEdad(18);
        persona3.setSexo('H');
        persona3.setPeso(100.0);
        persona3.setAltura(1.80);

        Persona[] personas = {persona1, persona2, persona3};
        String[] etiquetas = {"Persona 1", "Persona 2", "Persona 3"};

        System.out.println("\nLos resultados de las personas son:\n");

        for (int i = 0; i < personas.length; i++) {
            System.out.println(etiquetas[i] + ":");
            
            int imc = personas[i].calcularIMC();
            System.out.print("Estado de peso: ");
            if (imc == Persona.IMC_DEBAJO_PESO) {
                System.out.println("Por debajo de su peso ideal (-1)");
            } else if (imc == Persona.IMC_PESO_IDEAL) {
                System.out.println("En su peso ideal (0)");
            } else if (imc == Persona.IMC_SOBREPESO) {
                System.out.println("Tiene sobrepeso (1)");
            } else {
                System.out.println("No se pudo calcular (peso o altura 0)");
            }

            System.out.print("Mayor de edad: ");
            if (personas[i].esMayorDeEdad()) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            System.out.println("\nInformacion de las personas.-\n" + personas[i].toString());
            System.out.println("---------------------------\n");
        }

        scanner.close();
    }

    private static String pedirString(Scanner scanner, String campo) {
        System.out.print("Ingrese " + campo + ": ");
        return scanner.nextLine();
    }

    private static int pedirInt(Scanner scanner, String campo) {
        System.out.print("Ingrese " + campo + ": ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Ingrese un numero valido.");
            scanner.next();
            System.out.print("Ingrese " + campo + ": ");
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private static double pedirDouble(Scanner scanner, String campo) {
        System.out.print("Ingrese " + campo + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Ingrese un numero valido.");
            scanner.next();
            System.out.print("Ingrese " + campo + ": ");
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    private static char pedirSexo(Scanner scanner) {
        System.out.print("Ingrese Sexo (H/M): ");
        String input = scanner.nextLine().toUpperCase();
        if (input.length() > 0) {
            return input.charAt(0);
        }
        return Persona.SEXO_HOMBRE;
    }
}