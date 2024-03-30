package proyecto_banco;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Integer;
public class Main {
    public static void main(String[] args) {

        String opc = "";
        // Crear un banco
        Banco banco = new Banco();

        // Crear clientes
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        // Agregar cuentas a los clientes
        cliente1.agregarCuenta(new CuentaDebito(1000));
        cliente2.agregarCuenta(new CuentaCredito(500));

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Realizar retiros
        cliente1.retiro("CuentaDebito", 500);
        cliente2.retiro("CuentaCredito", 1000);

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        do {
            System.out.println("1.Consultar saldo");
            System.out.println("2.Retirar");
            System.out.println("3.Depositar");
            System.out.println("4.Pagar tarjeta credito");
            System.out.println("5.Salir");

            try {
                opc = br.readLine();
                switch (Integer.parseInt(opc)) {
                    case 1:
                        cliente1.imprimirSaldoCuentas();
                        break;

                    default:
                        break;
                }
            } catch (Exception e) {
            }
        } while (!opc.equals("5"));

    }
}
