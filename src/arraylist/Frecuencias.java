import java.util.ArrayList;
import java.util.Random;

public class Frecuencias {

    private static final int CANTIDAD = 100;
    private static final int MIN = 1;
    private static final int MAX = 20;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarAleatorios(CANTIDAD, MIN, MAX);
        int[] frecuencias = contarFrecuencias(numeros, MIN, MAX);

        imprimirTabla(frecuencias, MIN);
        System.out.println("\n Numero mas frecuente: " + encontrarMasFrecuente(frecuencias, MIN));
    }

    private static ArrayList<Integer> generarAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextInt(max - min + 1) + min);
        }
        return lista;
    }

    private static int[] contarFrecuencias(ArrayList<Integer> lista, int min, int max) {
        int[] frecuencias = new int[max - min + 1];
        for (int valor : lista) {
            frecuencias[valor - min]++;
        }
        return frecuencias;
    }

    private static void imprimirTabla(int[] frecuencias, int min) {
        System.out.printf("%-10s %-10s%n", "Numero", "Frecuencia");
        System.out.println("-------------------");
        for (int i = 0; i < frecuencias.length; i++) {
            System.out.printf("%-10d %-10d%n", (i + min), frecuencias[i]);
        }
    }

    private static int encontrarMasFrecuente(int[] frecuencias, int min) {
        int indiceMax = 0;
        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > frecuencias[indiceMax]) indiceMax = i;
        }
        return indiceMax + min;
    }
}