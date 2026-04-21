package U4P2;
class Auto extends Vehiculo {
    private int kilometros;

    // [ERROR 2] Constructor de Auto no llama al constructor de la clase padre.
    // Como Vehiculo NO tiene constructor sin parámetros, Java intenta llamar a super() 
    // implícitamente y falla con "error: constructor Vehiculo in class Vehiculo cannot be applied to given types".
    // [CORRECCIÓN] Se añade super(nombre) como primera línea del constructor.
    public Auto(String nombre, int kilometros) {
        super(nombre); // Llama al constructor de Vehiculo
        this.kilometros = kilometros;
    }

    @Override
    public double calcularCosto() {
        return kilometros * 5.0; // Se usa 5.0 para asegurar retorno double
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("  Tipo: Auto | Kilómetros: " + kilometros);
    }
}
