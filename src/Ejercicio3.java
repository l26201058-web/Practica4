import java.util.Scanner;
/*
INSITUTO TECNOLOGICO DE PACHUCA
FUNDAMENTOS DE PROGRAMACION
EJERCICIO: NUMEROS AMIGOS CON FOR, DO-WHILE, WHILE, IF Y ACUMULADORES
ALUMNOS: DIAZ CERON JOSE LUIS    26201058
24-10-2026
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetir;
        int opcion;
        do {
            int num1 = 0, num2 = 0;
            int sumaDiv1 = 0;
            int sumaDiv2 = 0;

            while (num1 <= 0 || num2 <= 0) {
                System.out.print("Ingresa el primer número entero positivo: ");
                num1 = scanner.nextInt();
                System.out.print("Ingresa el segundo número entero positivo: ");
                num2 = scanner.nextInt();
                if (num1 <= 0 || num2 <= 0) {
                    System.out.println("Ambos números deben ser mayores a cero.\n");
                }
            }

            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sumaDiv1 += i;
                }
            }
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    sumaDiv2 += i;
                }
            }

            int sonAmigos = 0;
            if (sumaDiv1 == num2 && sumaDiv2 == num1) {
                sonAmigos = 1;
            }

            System.out.println("\nElige qué deseas mostrar:");
            System.out.println("1. Mostrar suma de divisores y resultado");
            System.out.println("2. Mostrar únicamente el resultado de la comparación");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Suma de divisores propios de " + num1 + " es: " + sumaDiv1);
                    System.out.println("Suma de divisores propios de " + num2 + " es: " + sumaDiv2);
                    if (sonAmigos == 1) {
                        System.out.println("Resultado: ¡Son números amigos!");
                    } else {
                        System.out.println("Resultado: No son números amigos.");
                    }
                    break;
                case 2:
                    if (sonAmigos == 1) {
                        System.out.println("Resultado: Los números " + num1 + " y " + num2 + " SÍ son amigos.");
                    } else {
                        System.out.println("Resultado: Los números " + num1 + " y " + num2 + " NO son amigos.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.print("\n¿Deseas analizar otra pareja? (1. Sí / 2. No): ");
            repetir = scanner.nextInt();
        } while (repetir == 1);

        scanner.close();
    }
}