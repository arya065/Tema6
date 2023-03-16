package Tarea6A;

import java.time.*;

abstract class Persona {

    private String nombre;
    private String apellido;
    private NIF nif;

    public Persona(String nombre, String apellido, NIF nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    public void renovarNif(LocalDateTime fechaSolicitud) {
        if (LocalDateTime.now().getYear() - fechaSolicitud.getYear() > 10) {
            System.out.println("Fecha Solicitud no puede ser mas de 10 anos desde la fecha  de la solicitud renovacion");
        } else {
            nif.renovar(fechaSolicitud);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public NIF getNif() {
        return nif;
    }

}
