package U5A2;

public class Cajero {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(500.00);
        System.out.println("Saldo inicial: $" + miCuenta.getSaldo());

        try {
            miCuenta.depositar(200.00);
            System.out.println("Depósito realizado. Nuevo saldo: $" + miCuenta.getSaldo());

            miCuenta.retirar(300.00);
            System.out.println("Retiro realizado. Saldo restante: $" + miCuenta.getSaldo());

            System.out.println("Intentando retirar $600.00...");
            miCuenta.retirar(600.00); 
            System.out.println("Retiro exitoso.");

        } catch (SaldoInsuficienteException e) {
            System.out.println("ERROR CAPTURADO: " + e.getMessage());
            System.out.println("\nTraza del error (printStackTrace):");
            e.printStackTrace();
        }
    }
}