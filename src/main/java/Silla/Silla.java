package Silla;

import java.util.*;

public class Silla implements Comparable<Silla> {

    private double peso;
    private String nombre;
    //equals, hashcode, compareTo

    public Silla(double peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Silla o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Silla other = (Silla) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Silla{" + "peso=" + peso + ", nombre=" + nombre + '}';
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

}
