package Tarea6A;

import java.time.*;
import java.util.*;
public class NIF {

    private long numero;
    private char letra;
    private LocalDateTime fechaCaducidad;

    public NIF(long numero, LocalDateTime fechaCaducidad) {
        this.numero = numero;
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public char calcularLetra(){
        Random rand = new Random();
        long numRand = rand.nextLong(99999999);
        numRand = Math.round(numRand % 23);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraNif = letras.charAt((int) numRand);
        return letraNif;
    }

    public void renovar (LocalDateTime fechaSolicitudRenovacion){
        setFechaCaducidad(fechaSolicitudRenovacion);
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDateTime getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
}
