package alquiler;

public class Aplicacion {
    public static void main(String arg[]) {
        int continuar = 1;
        System.out.println("Bienvenido al sistema de alquiler de vehiculos porfavor seleccione una opcion valida.-");
        while (continuar == 1) {
            System.out.println("1. Alquilar Coche");
            System.out.println("2. Alquilar Microbus");
            System.out.println("3. Alquilar Furgoneta de Carga");
            System.out.println("4. Alquilar Camion");
            System.out.println("5. Mostrar Ejemplos de Precios");
            System.out.println("6. Salir");

            int opcion = leerEntero("Seleccione una opcion valida.- ");

            switch (opcion) {
                case 1:
                    alquilarCoche();
                    break;
                case 2:
                    alquilarMicrobus();
                    break;
                case 3:
                    alquilarFurgoneta();
                    break;
                case 4:
                    alquilarCamion();
                    break;
                case 5:
                    mostrarCalculos();
                    break;
                case 6:
                    continuar = 0;
                    System.out.println("\nEsta saliendo del sistema de alquiler");
                    break;
                default:
                    System.out.println("Opcion no valida selecione una opcion valida.-");
            }
        }
    }

    public static void alquilarCoche() {
        System.out.println("\nBienvenido al  sistema de alquiler de coches porfavor ingrese los siguientes datos.-");
        String matricula = leerTexto("Ingrese matricula: ");
        int dias = leerEntero("Ingrese dias de alquiler: ");
        int plazas = leerEntero("Ingrese numero de plazas: ");

        Vehiculo_persona coche = new Coche(matricula, dias, plazas);
        System.out.println(coche.informacion());
        System.out.println("Precio total: " + coche.calcularPrecio() + " pesos");
        System.out.println("esta saliendo del alquler de coches gracias por alquilar con nosotros.-");
    }

    public static void alquilarMicrobus() {
        System.out.println("\nBienvenido al  sistema de alquiler de microbuses porfavor ingrese los siguientes datos.-");
        String matricula = leerTexto("Ingrese matricula: ");
        int dias = leerEntero("Ingrese dias de alquiler: ");
        int plazas = leerEntero("Ingrese numero de plazas: ");

        Vehiculo_persona micro = new Microbus(matricula, dias, plazas);
        System.out.println(micro.informacion());
        System.out.println("Precio total: " + micro.calcularPrecio() + " pesos");
        System.out.println("esta saliendo del alquler de microbuses gracias por alquilar con nosotros.-");
    }

    public static void alquilarFurgoneta() {
        System.out.println("\nBienvenido al  sistema de alquiler de furgonetas porfavor ingrese los siguientes datos.-");
        String matricula = leerTexto("Ingrese matricula: ");
        int dias = leerEntero("Ingrese dias de alquiler: ");
        double pma = leerDouble("Ingrese PMA (toneladas): ");

        Vehiculo_carga furgoneta = new FurgonetaCarga(matricula, dias, pma);
        System.out.println(furgoneta.informacion());
        System.out.println("Precio total: " + furgoneta.calcularPrecio() + " pesos");
        System.out.println("esta saliendo del alquler de furgonetas gracias por alquilar con nosotros.-");
    }

    public static void alquilarCamion() {
        System.out.println("\nBienvenido al  sistema de alquiler de camiones porfavor ingrese los siguientes datos.-");
        String matricula = leerTexto("Ingrese matricula: ");
        int dias = leerEntero("Ingrese dias de alquiler: ");
        double pma = leerDouble("Ingrese PMA (toneladas): ");

        Vehiculo_carga camion = new Camion(matricula, dias, pma);
        System.out.println(camion.informacion());
        System.out.println("Precio total: " + camion.calcularPrecio() + " pesos");
        System.out.println("esta saliendo del alquler de camiones gracias por alquilar con nosotros.-");
    }

    public static void mostrarCalculos() {
        System.out.println("\nBienvenido a los ejemplos de calculo de precios.-");
        Vehiculo_persona coche = new Coche("ABC-123", 5, 4);
        System.out.println("\n1. COCHE:");
        System.out.println(coche.informacion());
        System.out.println("Precio: " + coche.calcularPrecio() + " pesos");
        System.out.println("Nombre del Vehiculo: " + coche.nombreVehiculo);

        Vehiculo_persona micro = new Microbus("DEF-456", 3, 15);
        System.out.println("\n2. MICROBUS:");
        System.out.println(micro.informacion());
        System.out.println("Precio: " + micro.calcularPrecio() + " pesos");

        Vehiculo_carga furgoneta = new FurgonetaCarga("GHI-789", 7, 3.5);
        System.out.println("\n3. FURGONETA:");
        System.out.println(furgoneta.informacion());
        System.out.println("Precio: " + furgoneta.calcularPrecio() + " pesos");

        Vehiculo_carga camion = new Camion("JKL-012", 10, 8.0);
        System.out.println("\n4. CAMION:");
        System.out.println(camion.informacion());
        System.out.println("Precio: " + camion.calcularPrecio() + " pesos");
        System.out.println("\nEsta saliendo de los ejemplos de calculo de precios gracias por usar nuestro sistema.-");
    }

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextDouble();
    }
}