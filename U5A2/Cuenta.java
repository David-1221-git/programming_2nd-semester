package U5A2;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente. Disponible: $" + String.format("%.2f", saldo) + 
                ", Solicitado: $" + String.format("%.2f", monto)
            );
        }
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
