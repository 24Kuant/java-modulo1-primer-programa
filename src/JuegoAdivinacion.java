import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinacion {

    public static void main(String[] args) {
        int intentosPermitidos = 5;
        boolean adivino = false;

        Scanner teclado = new Scanner(System.in);
        int numeroMagico = new Random().nextInt(100);

        System.out.println("El número mágico es: " + numeroMagico);

        for (int numeroDeIntentos = 1; numeroDeIntentos <= intentosPermitidos; numeroDeIntentos++) {
            System.out.println("Intento [ " + numeroDeIntentos + " ]. Dame el número Mágico ?");
            int numero = teclado.nextInt();
            if (numero == numeroMagico) {
                System.out.println("Adivinaste el número Mágico [ " + numero + " ], en el intento numero: " + numeroDeIntentos);
                adivino = true;
                break;
            } else if (numero > numeroMagico ) {
                System.out.println("El número magico es menor a [ " + numero + " ].");
            }
            else {
                System.out.println("El número magico es mayor a [ " + numero + " ].");
            }
        }

        if (!adivino) {
            System.out.println("Lastima!! Fallaste. Se acabaros los " + intentosPermitidos + " intentos, no pudiste adivinar el número Mágico [ " + numeroMagico + " ].");
        }
    }
}
