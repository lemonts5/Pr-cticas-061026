import java.util.Scanner;

public class SumaGaussFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero N:");
        int n = scanner.nextInt();

        // 1. Suma paso a paso usando el ciclo for
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Suma total usando el ciclo for: " + suma);

        // 2. Suma directa usando la fórmula de Gauss
        int sumaGauss = (n * (n + 1)) / 2;
        System.out.println("Suma total usando la fórmula de Gauss: " + sumaGauss);
        
        scanner.close();
    }
}