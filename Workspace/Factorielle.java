import java.util.Scanner;

public class Factorielle {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        final int nombre = scanner.nextInt();
        scanner.close();

        long resultat = calculerFactorielle(nombre);
        System.out.println("La factorielle de " + nombre + " est :" + resultat);
    }

    public static long calculerFactorielle(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}