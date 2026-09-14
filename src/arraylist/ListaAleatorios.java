import java.util.ArrayList;
import java.util.Random;

public class ListaAleatorios {

    private static final int MIN = -10;
    private static final int MAX = 10;
    private static final int DETENCION = 10;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = leerHastaDetencion();
        System.out.println("Numeros leidos: " + numeros);
        System.out.println("Suma:  " + sumar(numeros));
        System.out.println("Media: " + calcularMedia(numeros));
    }

    private static ArrayList<Integer> leerHastaDetencion() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int valor;
        do {
            valor = random.nextInt(MAX - MIN + 1) + MIN;
            numeros.add(valor);
        } while (valor != DETENCION);
        return numeros;
    }

    private static int sumar(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int n : numeros) suma += n;
        return suma;
    }

    private static double calcularMedia(ArrayList<Integer> numeros) {
        return numeros.isEmpty() ? 0 : (double) sumar(numeros) / numeros.size();
    }
}