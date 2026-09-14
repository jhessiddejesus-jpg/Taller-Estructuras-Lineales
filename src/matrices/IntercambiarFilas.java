import java.util.Random;
import java.util.Scanner;

public class IntercambiarFilas {

    private static final int MIN = 1;
    private static final int MAX = 99;

    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.print("Filas (m): ");
        int m = digite.nextInt();
        System.out.print("Columnas (n): ");
        int n = digite.nextInt();

        int[][] matriz = generarMatriz(m, n, MIN, MAX);
        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        intercambiarFilas(matriz, 0, 1);
        System.out.println("\nDespues de intercambiar la 1 y 2 fila:");
        imprimirMatriz(matriz);
    }

    private static int[][] generarMatriz(int m, int n, int min, int max) {
        Random random = new Random();
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matriz;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%5d", valor);
            }
            System.out.println();
        }
    }

    private static void intercambiarFilas(int[][] matriz, int filaA, int filaB) {
        if (filaA < 0 || filaB < 0 || filaA >= matriz.length || filaB >= matriz.length) {
            throw new IllegalArgumentException("indices de fila fuera de rango");
        }
        int[] temporal = matriz[filaA];
        matriz[filaA] = matriz[filaB];
        matriz[filaB] = temporal;
    }
}
