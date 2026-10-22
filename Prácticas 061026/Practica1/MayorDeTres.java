import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tres números enteros (a, b, c):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("El mayor es a: " + a);
            } else {
                System.out.println("El mayor es c: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("El mayor es b: " + b);
            } else {
                System.out.println("El mayor es c: " + c);
            }
        }
        scanner.close();
    }
}