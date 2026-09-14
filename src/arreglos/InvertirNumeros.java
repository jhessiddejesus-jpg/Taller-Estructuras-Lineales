import java.util.Arrays;
import java.util.Random;

public class InvertirNumeros {

    private static final int CANTIDAD = 20;
    private static final int MIN = 100;
    private static final int MAX = 9999;

    public static void main(String[] args) {
        int[] originales = generarAleatorios(CANTIDAD, MIN, MAX);
        int[] invertidos = invertirTodos(originales);

        System.out.println("Originales: " + Arrays.toString(originales));
        System.out.println("Invertidos: " + Arrays.toString(invertidos));
    }

    private static int[] generarAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = random.nextInt(max - min + 1) + min;
        }
        return arreglo;
    }

    private static int[] invertirTodos(int[] arreglo) {
        int[] invertidos = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertidos[i] = invertirNumero(arreglo[i]);
        }
        return invertidos;
    }

    private static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }
}
