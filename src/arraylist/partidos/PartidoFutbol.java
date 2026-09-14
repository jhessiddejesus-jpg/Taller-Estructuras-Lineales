
public class PartidoFutbol {

    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public PartidoFutbol(String equipoLocal, String equipoVisitante,
                         int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public PartidoFutbol() {
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }


    public boolean ganoVisitante() {
        return golesVisitante > golesLocal;
    }

    public boolean ganoLocal() {
        return golesLocal > golesVisitante;
    }

    public boolean esEmpate() {
        return golesLocal == golesVisitante;
    }

    public boolean gano(String equipo) {
        if (equipo.equalsIgnoreCase(equipoLocal)) return ganoLocal();
        if (equipo.equalsIgnoreCase(equipoVisitante)) return ganoVisitante();
        return false;
    }

    @Override
    public String toString() {
        return equipoLocal + " " + golesLocal + " - "
                + golesVisitante + " " + equipoVisitante;
    }
}