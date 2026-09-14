public class CienPares {
    private static final int TOTAL = 100;
    private static final int POR_LINEA = 10;
    
    public static void main(String[] args) {
        int pares [] = generarPares(TOTAL);
        imprimirEnUnaLinea(pares);
        imprimirEnLineas(pares, POR_LINEA);
    }
    
    private static int[] generarPares(int cantidad) {
        int pares[] = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            pares[i] = (i + 1) * 2;
        }
        return pares;
    }
    
    private static void imprimirEnUnaLinea(int arreglo[]) {
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
    
    private static void imprimirEnLineas(int arreglo[], int porLinea) {
        for (int i = 0; i < arreglo.length; i++) {
            if (i % porLinea == 0) {
                System.out.printf("Linea %d: ", (i / porLinea) + 1);
            }
            System.out.print(arreglo[i] + " ");
            if ((i + 1) % porLinea == 0) {
                System.out.println();
            }
        }
    }
}
