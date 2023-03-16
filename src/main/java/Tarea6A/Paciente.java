package Tarea6A;

import java.time.*;
import java.util.*;

public class Paciente extends Persona implements Nadador{

    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellido, NIF nif) {
        super(nombre, apellido, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public void tomarMedicina(String medicina) {
        Random rand = new Random();
        System.out.println("Paciente" + getNombre() + " " + getApellido() + "toma" + medicina);
        int siNo = rand.nextInt(2);
        if (siNo == 0) {
            System.out.println("Quieda varios dias");
        } else {
            System.out.println("Quieda muchos dias");
        }
    }

    @Override
    public void swim() {
        System.out.println("Soy nadador");
    }

}
