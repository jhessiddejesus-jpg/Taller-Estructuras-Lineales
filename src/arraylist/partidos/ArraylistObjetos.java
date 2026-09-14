import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistObjetos {

    private static final String NOMBRE_FICHERO = "src/recursos/partidos.txt";
    private static final String EQUIPO_BUSCADO = "Barcelona";

    public static void main(String[] args) {

        // 1. Cargar los partidos desde el archivo
        ArrayList<PartidoFutbol> partidos = cargarPartidos();
        System.out.println("... Guardados " + partidos.size() + " partidos de fútbol ...");

        imprimirPartidos(partidos);

        mostrarGanadoresVisitante(partidos);
        contarVictoriasDe(partidos, EQUIPO_BUSCADO);
        contarVictoriasLocal(partidos);
        eliminarNoEmpates(partidos);
    }

    // CARGA DE DATOS
    private static ArrayList<PartidoFutbol> cargarPartidos() {
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        File fichero = new File(NOMBRE_FICHERO);

        Scanner s = null;

        try {
            s = new Scanner(fichero);
            while (s.hasNext()) {
                String linea = s.nextLine();
                String[] campos = linea.split("::");

                PartidoFutbol partido = new PartidoFutbol();
                partido.setEquipoLocal(campos[0]);
                partido.setEquipoVisitante(campos[1]);
                partido.setGolesLocal(Integer.parseInt(campos[2]));
                partido.setGolesVisitante(Integer.parseInt(campos[3]));

                partidos.add(partido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (s != null) s.close();
        }

        return partidos;
    }
    // IMPRESIÓN GENERAL
    private static void imprimirPartidos(ArrayList<PartidoFutbol> partidos) {
        System.out.println("\n---Resultados de los partidos de futbol ---");
        for (PartidoFutbol partido : partidos) {
            System.out.println(partido.getEquipoLocal() + " "
                    + partido.getGolesLocal() + " - "
                    + partido.getGolesVisitante() + " "
                    + partido.getEquipoVisitante());
        }
    }

    // 1) Partidos donde gano el visitante
    private static void mostrarGanadoresVisitante(ArrayList<PartidoFutbol> partidos) {
        System.out.println("\n---Partidos donde gano el visitante---");
        for (PartidoFutbol partido : partidos) {
            if (partido.ganoVisitante()) {
                System.out.println(partido);
            }
        }
    }

    // 2) Contar victorias de un equipo (Barcelona)
    private static void contarVictoriasDe(ArrayList<PartidoFutbol> partidos, String equipo) {
        int contador = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.gano(equipo)) {
                contador++;
            }
        }
        System.out.println("\n--- Victorias del " + equipo + " ---");
        System.out.println(equipo + " gano: " + contador + " veces.");
    }

    // 3) Contar victorias del equipo local
    private static void contarVictoriasLocal(ArrayList<PartidoFutbol> partidos) {
        int contador = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.ganoLocal()) {
                contador++;
            }
        }
        System.out.println("\n--- Victorias del equipo local ---");
        System.out.println("El equipo local gano" + contador + " veces.");
    }

    // 4) Eliminar partidos que NO son empate
    private static void eliminarNoEmpates(ArrayList<PartidoFutbol> partidos) {
        Iterator<PartidoFutbol> it = partidos.iterator();
        while (it.hasNext()) {
            PartidoFutbol partido = it.next();
            if (!partido.esEmpate()) {
                it.remove();
            }
        }

        System.out.println("\n--- Partidos que quedaron (solo empates) ---");
        if (partidos.isEmpty()) {
            System.out.println("No quedaron empates en la lista.");
        } else {
            for (PartidoFutbol partido : partidos) {
                System.out.println(partido);
            }
            System.out.println("Total de empates: " + partidos.size());
        }
    }
}