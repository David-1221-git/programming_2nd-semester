package U4P2;
public class Main {
    public static void main(String[] args) {
        // [ERROR 4/5] El arreglo original tenía tamaño fijo 3. Al agregar Motocicleta (Reto),
        // se generaría ArrayIndexOutOfBoundsException. Además, es buena práctica validar null.
        // [CORRECCIÓN] Se amplía a 4 posiciones y se añade validación en el bucle.
        Vehiculo[] lista = new Vehiculo[4];

        // [ERROR 1] lista[0] = new Vehiculo("Genérico");
        // Las clases abstractas NO pueden instanciarse con new. El compilador marca:
        // "error: Vehiculo is abstract; cannot be instantiated"
        // [CORRECCIÓN] Se reemplaza por una instancia concreta o se elimina la línea.
        lista[0] = new Auto("Auto1", 100);
        lista[1] = new Camion("Camion1", 200);
        lista[2] = new Motocicleta("Moto1", 150); // Reto integrado
        lista[3] = new Auto("Auto2", 500);       // Relleno para demostrar polimorfismo

        for (int i = 0; i < lista.length; i++) {
            // Validación para evitar NullPointerException si el arreglo no está completamente lleno
            if (lista[i] != null) {
                lista[i].mostrar();
                // [POLIMORFISMO APLICADO] Aunque lista[i] es de tipo Vehiculo,
                // Java invoca dinámicamente el método calcularCosto() de la clase real del objeto.
                System.out.println("  Costo: $" + lista[i].calcularCosto());
                System.out.println("--------------------");
            }
        }
    }
}