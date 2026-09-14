import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Factoriales {
    private static final int MINIMO = 0;
    private static final int MAXIMO = 12;
    
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.print("Ingrese cantidad de numeros: ");
        int n = digite.nextInt();
        
        int numeros [] = generarAleatorios(n, MINIMO, MAXIMO);
        long factoriales[] = calcularFactoriales(numeros);
        
        System.out.println("Numeros: " + Arrays.toString(numeros));
        System.out.println("Factoriales: " + Arrays.toString(factoriales));
    }
    
    private static int[] generarAleatorios(int n, int min, int max) {
        Random random = new Random();
        int arreglo [] = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(max - min + 1) + min;
        }
        return arreglo;
    }
    
    private static long[] calcularFactoriales(int numeros []) {
        long factoriales [] = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]);
        }
        return factoriales;
    }
    
    private static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}