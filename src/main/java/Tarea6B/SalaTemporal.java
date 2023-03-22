package Tarea6B;

import java.time.*;

public class SalaTemporal extends Sala {

    private LocalDateTime fechaIni;
    private LocalDateTime fechaFin;

    public SalaTemporal(LocalDateTime fechaIni, LocalDateTime fechaFin, Temperatura temp, Humedad hum) {
        super(temp, hum);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

}
