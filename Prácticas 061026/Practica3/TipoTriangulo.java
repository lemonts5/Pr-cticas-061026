import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce las medidas de los tres lados del triángulo (a, b, c):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Desigualdad triangular
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("El triángulo es equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es isósceles");
            } else {
                System.out.println("El triángulo es escaleno");
            }
        } else {
            System.out.println("Las medidas no forman un triángulo válido");
        }
        scanner.close();
    }
}