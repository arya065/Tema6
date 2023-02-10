package ej1;

import java.util.*;
import java.time.*;

public class test {

    public static void main(String[] args) {
        Casa casa = new Casa();
        Puerta puerta = new Puerta(200, 50);
        Calefactor calefactor = new Calefactor(25);
        Ventana ventana = new Ventana(100, 50);
        Persiana persiana = new Persiana("plastico");

        System.out.println(casa.toString());
        System.out.println(puerta.toString());
        System.out.println(calefactor.toString());
        System.out.println(ventana.toString());
        System.out.println(persiana.toString());
        System.out.println("-------------------------");
        puerta.abrirPuerta();
        puerta.cerrarPuerta();
        calefactor.encender();
        calefactor.apagar();
        System.out.println("Temperatura es " + calefactor.fijarTemperatura());
        ventana.abrirVentana();
        ventana.cerrarVentana();
        persiana.bajar();
        persiana.subir();
    }
}
