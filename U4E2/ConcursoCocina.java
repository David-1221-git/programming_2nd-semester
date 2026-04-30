package U4E2;

public class ConcursoCocina {
    public static void main(String[] args) {
        Cocinero[] concursantes = new Cocinero[4];
        concursantes[0] = new CocineroTradicional("Ana García", "Mole Poblano", 75.0, 45);
        concursantes[1] = new CocineroTradicional("Luis Martínez", "Cochinita Pibil", 80.0, 120);
        concursantes[2] = new CocineroCreativo("Elena Ruiz", "Tacos de Sushi", 70.0, 8);
        concursantes[3] = new CocineroInternacional("Carlos Vega", "Risotto de Chapulines", 85.0, 4, true);
        System.out.println("RESULTADOS DEL CONCURSO\n");
        for (Cocinero cocinero : concursantes) {
            cocinero.mostrarDatos();
            System.out.printf("Puntaje Final: %.2f%n", cocinero.calcularPuntajeFinal());
            System.out.println("-----------------------------------");
        }
    }
}