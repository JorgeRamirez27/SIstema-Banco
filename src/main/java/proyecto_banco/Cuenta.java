package proyecto_banco;

public class Cuenta {
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodo para retirar dinero
    public void retiro(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= cantidad;
    }
}
