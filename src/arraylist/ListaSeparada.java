import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListaSeparada {

    private static final int CANTIDAD = 20;
    private static final int MIN = 1;
    private static final int MAX = 100;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarAleatorios(CANTIDAD, MIN, MAX);
        System.out.println("Original:     " + numeros);

        ArrayList<Integer> ascendente = new ArrayList<>(numeros);
        Collections.sort(ascendente);
        System.out.println("Ascendente:   " + ascendente);

        ArrayList<Integer> descendente = new ArrayList<>(numeros);
        descendente.sort(Collections.reverseOrder());
        System.out.println("Descendente:  " + descendente);

        System.out.println("Pares:        " + filtrar(numeros, true));
        System.out.println("Impares:      " + filtrar(numeros, false));
    }

    private static ArrayList<Integer> generarAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextInt(max - min + 1) + min);
        }
        return lista;
    }

    private static ArrayList<Integer> filtrar(ArrayList<Integer> lista, boolean pares) {
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int valor : lista) {
            if ((valor % 2 == 0) == pares) resultado.add(valor);
        }
        return resultado;
    }
}