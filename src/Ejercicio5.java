import java.util.Scanner;
/*
INSITUTO TECNOLOGICO DE PACHUCA
FUNDAMENTOS DE PROGRAMACION
EJERCICIO: MENU
ALUMNOS: DIAZ CERON JOSE LUIS    26201058
24-10-2026
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // do-while para mostrar el menú repetidamente hasta salir
        do {
            System.out.println("\n--- MENÚ DE OPERACIONES MATEMÁTICAS ---");
            System.out.println("1. Calcular el cuadrado de un número");
            System.out.println("2. Calcular el cubo de un número");
            System.out.println("3. Determinar si un número es par o impar");
            System.out.println("4. Calcular la suma de los números desde 1 hasta N");
            System.out.println("5. Salir del programa");
            System.out.print("Elige una opción (1-5): ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Error: Ingresa un número válido.");
                scanner.next();
                opcion = 0;
                continue;
            }

            // switch para ejecutar la operación correspondiente
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("El cuadrado de " + num1 + " es: " + (num1 * num1));
                    break;

                case 2:
                    System.out.print("Ingresa un número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("El cubo de " + num2 + " es: " + (num2 * num2 * num2));
                    break;

                case 3:
                    System.out.print("Ingresa un número entero: ");
                    int num3 = scanner.nextInt();
                    // if-else para par o impar
                    if (num3 % 2 == 0) {
                        System.out.println("El número " + num3 + " es PAR.");
                    } else {
                        System.out.println("El número " + num3 + " es IMPAR.");
                    }
                    break;

                case 4:
                    System.out.print("Ingresa un número entero positivo N: ");
                    int n = scanner.nextInt();
                    // if-else para validar que sea positivo
                    if (n > 0) {
                        int suma = 0;
                        for (int i = 1; i <= n; i++) {
                            suma += i;
                        }
                        System.out.println("La suma desde 1 hasta " + n + " es: " + suma);
                    } else {
                        System.out.println("Error: El número debe ser positivo.");
                    }
                    break;

                case 5:
                    System.out.println("¡Gracias por usar el programa! Hasta luego.");
                    break;

                default:
                    // Mensaje de error si la opción no existe
                    System.out.println("Error: Opción no existente. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 5);
    }
}