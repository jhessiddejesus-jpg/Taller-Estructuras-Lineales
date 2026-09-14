public class Transpuesta {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] transpuesta = calcularTranspuesta(matriz);
        System.out.println("\nTranspuesta:");
        imprimirMatriz(transpuesta);
    }

    private static int[][] calcularTranspuesta(int[][] matriz) {
        int m = matriz.length;
        int n = matriz[0].length;
        int[][] transpuesta = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%5d", valor);
            }
            System.out.println();
        }
    }
}
