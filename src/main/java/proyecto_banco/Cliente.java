package proyecto_banco;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nombre;
    private List<Cuenta> cuentas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cuenta> getCuentas() {
        return this.cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    // Método para agregar una cuenta
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    // Método en la clase Cliente para imprimir el saldo de todas las cuentas del
    // cliente
    public void imprimirSaldoCuentas() {
        System.out.println("Saldo de las cuentas de " + nombre + ":");
        for (Cuenta cuenta : cuentas) {
            System.out.println("Tipo de cuenta: " + cuenta.getClass().getSimpleName());
            System.out.println("Saldo: " + cuenta.getSaldo());
        }
    }

    // Método para realizar un retiro en una cuenta específica
    public void retiro(String tipoCuenta, double cantidad) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getClass().getSimpleName().equals(tipoCuenta)) {
                try {
                    cuenta.retiro(cantidad);
                    System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldo());
                } catch (SaldoInsuficienteException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("No se encontró la cuenta especificada");
    }

}
