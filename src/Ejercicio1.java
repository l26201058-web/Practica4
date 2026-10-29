import java.util.Scanner;
/*
INSITUTO TECNOLOGICO DE PACHUCA
FUNDAMENTOS DE PROGRAMACION
EJERCICIO: PRACTICA CON FOR, WHILE, IF, ACUMULADORES Y CONTADORES
ALUMNOS: DIAZ CERON JOSE LUIS    26201058
23-10-2026
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionRepetir, op2 ,n,sumaDiv4 = 0,contMult3 = 0,contAmbos = 0,contPares = 0,contImpares = 0,contMult5 = 0,opcion;
        do {
            System.out.print("Ingresa un número entero positivo N: ");
            n = scanner.nextInt();
            while (n <= 0) {
                if (n <= 0) {
                    System.out.println("El número debe ser mayor a 0.");
                    n = scanner.nextInt();
                } else {
                    System.out.println("Entrada inválida. Ingresa un número entero.");
                }
            }
                for (int i = 1; i <= n; i++) {
                    if (i % 4 == 0) {
                        sumaDiv4 += i;
                    }
                    if (i % 3 == 0) {
                        contMult3++;
                    }
                    if (i % 4 == 0 && i % 3 == 0) {
                        contAmbos++;
                    }

                    if (i % 2 == 0) {
                        contPares++;
                    } else {
                        contImpares++;
                    }
                    if (i % 5 == 0) {
                        contMult5++;
                    }
                }

                System.out.println("\n--- RESULTADOS GENERALES ---");
                System.out.println("Suma de números divisibles entre 4: " + sumaDiv4);
                System.out.println("Cantidad de múltiplos de 3: " + contMult3);
                System.out.println("Números divisibles entre 4 y 3: " + contAmbos);
                do{
                    System.out.println("\n¿Qué estadísticas deseas visualizar?");
                    System.out.println("1. Números pares");
                    System.out.println("2. Números impares");
                    System.out.println("3. Múltiplos de 5");
                    System.out.println("4. Ninguna");
                    System.out.print("Elige una opción (1-4): ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Total de números pares entre 1 y " + n + ": " + contPares);
                            break;
                        case 2:
                            System.out.println("Total de números impares entre 1 y " + n + ": " + contImpares);
                            break;
                        case 3:
                            System.out.println("Total de múltiplos de 5 entre 1 y " + n + ": " + contMult5);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    System.out.println("¿Desea visualizar otra estadistica? \n1)SI  \n2)NO");
                    op2 = scanner.nextInt();
                }while (op2 == 1 );
                System.out.print("\n¿Deseas analizar otra secuencia? \n1)SI  \n2)NO ");
                opcionRepetir = scanner.nextInt();
        }while (opcionRepetir == 1) ;
    }
}
