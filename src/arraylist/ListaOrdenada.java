import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaOrdenada {

    private static final int CANTIDAD = 20;

    public static void main(String[] args) {
        ArrayList<Integer> pares = generarPares(CANTIDAD);
        System.out.println("Lista inicial: " + pares);

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero a insertar: ");
        int valor = sc.nextInt();
        insertarOrdenado(pares, valor);
        System.out.println("Despues de insertar: " + pares);

        System.out.print("Ingrese numero a eliminar: ");
        int eliminar = sc.nextInt();
        boolean removido = pares.remove(Integer.valueOf(eliminar));
        System.out.println(removido ? "Valor eliminado." : "Valor no encontrado.");
        System.out.println("Despues de eliminar: " + pares);
    }

    private static ArrayList<Integer> generarPares(int cantidad) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            pares.add(i * 2);
        }
        return pares;
    }

    private static void insertarOrdenado(ArrayList<Integer> lista, int valor) {
        int posicion = Collections.binarySearch(lista, valor);
        if (posicion < 0) posicion = -posicion - 1;
        lista.add(posicion, valor);
    }
}