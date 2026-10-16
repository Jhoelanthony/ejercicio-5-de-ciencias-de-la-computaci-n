import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.print("Ingresa un número entero positivo (base 10): ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Por favor, ingresa un número entero no negativo.");
            } else {
                System.out.println("--- Resultados para el número " + n + " ---");

                // Caso especial para el 0
                if (n == 0) {
                    System.out.println("Binario con FOR: 0");
                    System.out.println("Binario con WHILE: 0");
                    System.out.println("Binario con DO-WHILE: 0");
                } else {
                    // A. Usando FOR
                    String binFor = "";
                    for (int aux = n; aux > 0; aux /= 2) {
                        int residuo = aux % 2;
                        binFor = residuo + binFor; // Anteponemos el residuo
                    }
                    System.out.println("Binario con FOR: " + binFor);

                    // B. Usando WHILE
                    String binWhile = "";
                    int auxWhile = n;
                    while (auxWhile > 0) {
                        int residuo = auxWhile % 2;
                        binWhile = residuo + binWhile;
                        auxWhile /= 2;
                    }
                    System.out.println("Binario con WHILE: " + binWhile);

                    // C. Usando DO-WHILE
                    String binDoWhile = "";
                    int auxDo = n;
                    do {
                        int residuo = auxDo % 2;
                        binDoWhile = residuo + binDoWhile;
                        auxDo /= 2;
                    } while (auxDo > 0);
                    System.out.println("Binario con DO-WHILE: " + binDoWhile);
                }
            }

            System.out.print("¿Deseas convertir otro número? (si/no): ");
            opcion = scanner.next().toLowerCase().charAt(0);

        } while (opcion == 's');

        System.out.println("¡Programa finalizado!");
        scanner.close();
    }
}