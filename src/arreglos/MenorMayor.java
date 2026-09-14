import java.util.Arrays;
import java.util.Random;

public class MenorMayor {

    private static final int CANTIDAD = 25;
    private static final int MIN = -50;
    private static final int MAX = 50;

    public static void main(String[] args) {
        int[] numeros = generarAleatorios(CANTIDAD, MIN, MAX);
        System.out.println("Arreglo: " + Arrays.toString(numeros));
        System.out.println("Menor:   " + encontrarMenor(numeros));
        System.out.println("Mayor:   " + encontrarMayor(numeros));
    }

    private static int[] generarAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = random.nextInt(max - min + 1) + min;
        }
        return arreglo;
    }

    private static int encontrarMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int valor : arreglo) {
            if (valor < menor) menor = valor;
        }
        return menor;
    }

    private static int encontrarMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int valor : arreglo) {
            if (valor > mayor) mayor = valor;
        }
        return mayor;
    }
}
