import java.util.Random;

public class MatrizSimetrica {

    private static final int MIN = 1;
    private static final int MAX = 9;
    private static final int TAMAÑO = 4;

    public static void main(String[] args) {
        int[][] matriz = generarMatriz(TAMAÑO, MIN, MAX);
        imprimirMatriz(matriz);

        System.out.println("¿Es simetrica? " + esSimetrica(matriz));
        imprimirEsquinas(matriz);
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

    private static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) return false;
            }
        }
        return true;
    }

    private static void imprimirEsquinas(int[][] matriz) {
        int n = matriz.length;
        System.out.printf("Esquinas: %d, %d, %d, %d%n",
                matriz[0][0], matriz[0][n - 1],
                matriz[n - 1][0], matriz[n - 1][n - 1]);
    }
}
