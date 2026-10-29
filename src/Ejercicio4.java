import java.util.Scanner;
/*
INSITUTO TECNOLOGICO DE PACHUCA
FUNDAMENTOS DE PROGRAMACION
EJERCICIO: CARRERA
ALUMNOS: DIAZ CERON JOSE LUIS    26201058
24-10-2026
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetirCompetencia;
        int opcion;
        do {
            System.out.print("Ingresa la cantidad de participantes: ");
            int numParticipantes = scanner.nextInt();

            double mayorDistancia = -1;
            int ganador = 1;
            double distanciaTotalGeneral = 0;

            int rondasBajo = 0;
            int rondasMedio = 0;
            int rondasAlto = 0;

            // for para recorrer participantes
            for (int p = 1; p <= numParticipantes; p++) {
                System.out.println("\n--- Participante " + p + " ---");
                double distanciaParticipante = 0;

                // for para recorrer las 5 rondas
                for (int r = 1; r <= 5; r++) {
                    double distanciaRonda = -1;

                    // while para validar que la distancia sea mayor o igual a cero
                    while (distanciaRonda < 0) {
                        System.out.print("Ingresa la distancia recorrida en la ronda " + r + " (km): ");
                        distanciaRonda = scanner.nextDouble();
                        if (distanciaRonda < 0) {
                            System.out.println("La distancia no puede ser negativa.");
                        }
                    }

                    distanciaParticipante += distanciaRonda;

                    // if-else para clasificar el rendimiento de la ronda
                    if (distanciaRonda < 2) {
                        rondasBajo++;
                    } else if (distanciaRonda >= 2 && distanciaRonda <= 4) {
                        rondasMedio++;
                    } else {
                        rondasAlto++;
                    }
                }

                distanciaTotalGeneral += distanciaParticipante;

                // Identificar al participante con mayor distancia acumulada
                if (distanciaParticipante > mayorDistancia) {
                    mayorDistancia = distanciaParticipante;
                    ganador = p;
                }
            }

            double promedioGeneral = distanciaTotalGeneral / numParticipantes;


            do {
                System.out.println("\n--- MENÚ DE ESTADÍSTICAS ---");
                System.out.println("1. Distancia total y promedio general");
                System.out.println("2. Conteo de rondas por categoría (Bajo, Medio, Alto)");
                System.out.println("3. Participante con mayor distancia acumulada");
                System.out.println("4. Terminar y registrar otra competencia");
                System.out.print("Elige una opción (1-4): ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n[Resultado] Distancia total: " + distanciaTotalGeneral + " km | Promedio: " + promedioGeneral + " km");
                        break;
                    case 2:
                        System.out.println("\n[Resultado] Rondas Bajo: " + rondasBajo + " | Medio: " + rondasMedio + " | Alto: " + rondasAlto);
                        break;
                    case 3:
                        System.out.println("\n[Resultado] Participante ganador: Participante " + ganador + " con " + mayorDistancia + " km");
                        break;
                    case 4:
                        System.out.println("\nSaliendo del menú de estadísticas...");
                        break;
                    default:
                        System.out.println("\nOpción no válida.");
                        break;
                }
            } while (opcion != 4);
            System.out.print("\n¿Deseas registrar otra competencia completa? (1. Sí / 2. No): ");
            repetirCompetencia = scanner.nextInt();
        } while (repetirCompetencia == 1);
    }
}