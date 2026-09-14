import java.util.Random;

public class DiagonalOpuesta {

    private static final int MIN = -50;
    private static final int MAX = 50;
    private static final int TAMAÑO = 4;

    public static void main(String[] args) {
        int[][] matriz = generarMatriz(TAMAÑO, MIN, MAX);
        imprimirMatriz(matriz);
        System.out.println("Suma diagonal opuesta: " + sumarDiagonalOpuesta(matriz));
    }

    private static int[][] generarMatriz(int n, int min, int max) {
        Random random = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
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

    private static int sumarDiagonalOpuesta(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        return suma;
    }
}
