import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la opción que a utilizar:");
        System.out.println("1. Determinar el mayor y el menor de tres valores distintos");
        System.out.println("2. Calificación");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:

                System.out.println("Ingrese el valor de A:");
                int A = scanner.nextInt();
                System.out.println("Ingrese el valor de B:");
                int B = scanner.nextInt();
                System.out.println("Ingrese el valor de C:");
                int C = scanner.nextInt();

                if (A == B || A == C || B == C) {
                    System.out.println("Los valores deben ser distintos.");
                } else {
                    int mayor, menor;

                    if (A > B && A > C) {
                        mayor = A;
                        if (B > C) {
                            menor = C;
                        } else {
                            menor = B;
                        }
                    } else if (B > A && B > C) {
                        mayor = B;
                        if (A > C) {
                            menor = C;
                        } else {
                            menor = A;
                        }
                    } else {
                        mayor = C;
                        if (A > B) {
                            menor = B;
                        } else {
                            menor = A;
                        }
                    }
                    System.out.println("El valor mayor es: " + mayor);
                    System.out.println("El valor menor es: " + menor);
                }
                break;

            case 2:
                System.out.println("Ingrese la calificación (1-10):");
                int calificacion = scanner.nextInt();

                switch (calificacion) {
                    case 1:
                    case 2:
                        System.out.println("Su calificación es: F");
                        break;
                    case 3:
                    case 4:
                        System.out.println("Su calificación es: D");
                        break;
                    case 5:
                    case 6:
                        System.out.println("Su calificación es: C");
                        break;
                    case 7:
                    case 8:
                        System.out.println("Su calificación es: B");
                        break;
                    case 9:
                    case 10:
                        System.out.println("Su calificación es: A");
                        break;
                    default:
                        System.out.println("Numero no valido");
                        break;
                }
                break;
                
            default:
                System.out.println("Opción no válida");
                break;
        }
        scanner.close();
    }
}
