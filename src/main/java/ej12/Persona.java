package ej12;

public class Persona {

    private String nombre;
    private String apellido;
    private String nif;

    public Persona(String nombre, String apellido, String nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNif() {
        return nif;
    }

}
