import java.util.Arrays;

public class ArreglosPrimos {
    private static final int PRIMOS []= {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    
    public static void main(String[] args) {
        imprimir(PRIMOS);
    }
    
    private static void imprimir(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }
}