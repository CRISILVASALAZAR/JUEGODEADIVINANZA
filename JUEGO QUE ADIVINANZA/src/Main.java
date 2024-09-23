import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de Random para generar el número aleatorio
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);  // Genera un número entre 0 y 100
        int intentos = 5;  // Número máximo de intentos

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Estoy pensando en un número entre 0 y 100.");
        System.out.println("Tienes " + intentos + " intentos para adivinar el número.");

        // Ciclo para dar al usuario los 5 intentos
        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": Ingresa tu número: ");
            int adivinanza = scanner.nextInt();

            // Comparar el número ingresado con el número secreto
            if (adivinanza < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en el intento " + i + ".");
                break;  // Sale del bucle si el número es correcto
            }

            // Si es el último intento y no acertó
            if (i == intentos) {
                System.out.println("Lo siento, se te acabaron los intentos. El número era " + numeroSecreto + ".");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
