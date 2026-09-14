import java.util.Random;
import java.util.Scanner;

public class BuscarEnMatriz {

    private static final int MIN = 1;
    private static final int MAX = 50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas: ");
        int m = sc.nextInt();
        System.out.print("Columnas: ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(m, n, MIN, MAX);
        imprimirMatriz(matriz);

        System.out.print("Numero a buscar: ");
        int buscado = sc.nextInt();

        int[] posicion = buscarPrimeraOcurrencia(matriz, buscado);
        if (posicion == null) {
            System.out.println("El numero " + buscado + " no se encuentra en la matriz.");
        } else {
            System.out.printf("Encontrado en [%d][%d]%n", posicion[0], posicion[1]);
        }
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

    private static int[] buscarPrimeraOcurrencia(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) return new int[]{i, j};
            }
        }
        return null;
    }
}