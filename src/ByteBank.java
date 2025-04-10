import java.util.Scanner;

public class ByteBank {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        char moneda = '$';


        String datosDelCliente = """
                
                ***************************************
                
                Nombre del cliente: %s
                tipo de cuenta: %s
                Saldo disponible: %c %.2f
                
                ***************************************
                """;
        String updateDatosDelCliente = datosDelCliente.formatted(nombreCliente, tipoCuenta, moneda, saldo);

        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                4 - Datos del cliente
                9 - Salir
                """;

        String saldoDisponible = """
                
                ***************************************
                
                Saldo disponible: %c %.2f
                
                ***************************************
                """;
        String updateSaldoDisponible = saldoDisponible.formatted(moneda, saldo);

        String retirarDinero = """
                
                ***************************************
                
                ¿Cuánto desea retirar? 
                
                ***************************************
                """;

        String depositarDinero = """
                
                ***************************************
                
                ¿Cuánto desea depositar? 
                
                ***************************************
                """;

        String fondosInsuficientes = """
                
                ***************************************
                
                No es posible retirar esa cantidad.
                No cuenta con los fondos suficientes.
                
                ***************************************
                """;

        String opcionInvalida = """
                
                ***************************************
                
                Opción No valida.
                Favor de teclear un número valido!! 
                
                ***************************************
                """;

        String mensajeSalida = """
                
                ***************************************
                
                       Salimos del programa.
                            Gracias por 
                    utilizar nuestros servicios 
                
                ***************************************
                """;

        System.out.print(updateDatosDelCliente);
        System.out.println(menu);

        int opcion = 0;
        while (opcion != 9) {  //indica que si presiona 9 es para salir de la app de softBank
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    updateSaldoDisponible = saldoDisponible.formatted(moneda, saldo);
                    System.out.println(updateSaldoDisponible);
                    break;
                case 2:
                    System.out.println(retirarDinero);
                    double retiro = teclado.nextDouble();
                    if (retiro > saldo) {
                        System.out.println(fondosInsuficientes);
                    } else {
                        saldo -= retiro;
                    }
                    break;
                case 3:
                    System.out.println(depositarDinero);
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    break;
                case 4:
                    updateDatosDelCliente = datosDelCliente.formatted(nombreCliente, tipoCuenta, moneda, saldo);
                    System.out.print(updateDatosDelCliente);
                    break;
                default:
                    System.out.println(opcionInvalida);
            }
            System.out.println(menu);
        }
        System.out.println(mensajeSalida);
    }
}
