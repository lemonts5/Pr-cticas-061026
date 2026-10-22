import java.util.Scanner;

public class CalificacionLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una calificación entre 0 y 100:");
        int calificacion = scanner.nextInt();

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Letra: A");
        } else if (calificacion >= 80 && calificacion <= 89) {
            System.out.println("Letra: B");
        } else if (calificacion >= 70 && calificacion <= 79) {
            System.out.println("Letra: C");
        } else if (calificacion >= 60 && calificacion <= 69) {
            System.out.println("Letra: D");
        } else if (calificacion >= 0 && calificacion <= 59) {
            System.out.println("Letra: F");
        } else {
            System.out.println("Calificación no válida (fuera del rango 0-100)");
        }
        scanner.close();
    }
}