import java.util.Scanner;
/*
INSTITUTO TECNOLOGICO DE PACHUCA
FUNDAMENTOS DE PROGRAMACION
EJERCICIO: AHORRO CON FOR, WHILE, IF, ACUMULADORES Y CONTADORES
ALUMNOS: DIAZ CERON JOSE LUIS    26201058
23-10-2026
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetir;

        do {
            double interesesTotales = 0;
            int mesesNecesarios = 0;
            int metaAlcanzada = 0; // 0 = No alcanzada, 1 = Sí alcanzada
            double inicial = -1, meta = -1, ahorroMensual = -1;

            // while para validar que los valores sean positivos
            while (inicial < 0 || meta < 0 || ahorroMensual < 0) {
                System.out.print("Ingresa la cantidad inicial de dinero: ");
                inicial = scanner.nextDouble();
                System.out.print("Ingresa la meta de ahorro: ");
                meta = scanner.nextDouble();
                System.out.print("Ingresa el ahorro mensual fijo: ");
                ahorroMensual = scanner.nextDouble();

                if (inicial < 0 || meta < 0 || ahorroMensual < 0) {
                    System.out.println("Los valores no pueden ser negativos. Intenta de nuevo.\n");
                }
            }

            double saldo = inicial;

            System.out.println("\nSelecciona el plazo de simulación:");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");
            System.out.print("Elige una opción: ");
            int opcionPlazo = scanner.nextInt();
            int mesesPlazo = 6;

            switch (opcionPlazo) {
                case 1: mesesPlazo = 6; break;
                case 2: mesesPlazo = 12; break;
                case 3: mesesPlazo = 24; break;
                default:
                    System.out.println("Opción inválida, se tomarán 6 meses por defecto.");
                    mesesPlazo = 6;
                    break;
            }

            // for para simular los meses
            for (int i = 1; i <= mesesPlazo; i++) {
                double interesMes = (saldo + ahorroMensual) * 0.01;
                interesesTotales += interesMes;
                saldo = saldo + ahorroMensual + interesMes;

                // if-else para determinar si se alcanzó la meta
                if (saldo >= meta && metaAlcanzada == 0) {
                    mesesNecesarios = i;
                    metaAlcanzada = 1;
                }
            }

            System.out.println("\n--- RESULTADOS DE LA SIMULACIÓN ---");
            System.out.println("Saldo final acumulado: $" + saldo);
            System.out.println("Intereses totales generados: $" + interesesTotales);

            if (metaAlcanzada == 1) {
                System.out.println("¡Meta alcanzada en el mes " + mesesNecesarios + "!");
            } else {
                System.out.println("No se logró alcanzar la meta en el plazo seleccionado.");
            }

            System.out.print("\n¿Deseas realizar otra simulación? (1. Sí / 2. No): ");
            repetir = scanner.nextInt();
        } while (repetir == 1);
    }
}