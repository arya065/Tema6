package estructurasDeAlmacenamiento;

import java.util.*;

public class Trenes {

    private int idTren;
    private int numVagones;
    private int numPasajerosTotal;

    public Trenes(int idTren, int numVagones, int numPasajerosTotal) {
        this.idTren = idTren;
        this.numVagones = numVagones;
        this.numPasajerosTotal = numPasajerosTotal;
    }

    public Trenes() {
    }

    public int getIdTren() {
        return idTren;
    }

    public void setIdTren(int idTren) {
        this.idTren = idTren;
    }

    public int getNumVagones() {
        return numVagones;
    }

    public void setNumVagones(int numVagones) {
        this.numVagones = numVagones;
    }

    public int getNumPasajerosTotal() {
        return numPasajerosTotal;
    }

    public void setNumPasajerosTotal(int numPasajerosTotal) {
        this.numPasajerosTotal = numPasajerosTotal;
    }

    @Override
    public String toString() {
        return "Trenes{" + "idTren=" + idTren + ", numVagones=" + numVagones + ", numPasajerosTotal=" + numPasajerosTotal + '}';
    }

}
