package Tarea6B;

public class SalaFija extends Sala {

    private String estado;

    public SalaFija(String estado, Temperatura temp, Humedad hum) {
        super(temp, hum);
        this.estado = estado;
    }

}
