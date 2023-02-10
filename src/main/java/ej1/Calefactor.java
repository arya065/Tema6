package ej1;

public class Calefactor extends Casa {

    private int temperatura;

    public Calefactor(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Calefactor{" + "temperatura=" + temperatura + '}';
    }

    public void encender() {
        System.out.println("calefactor encendida");
    }

    public void apagar() {
        System.out.println("calefactor apagado");
    }

    public int fijarTemperatura() {
        return temperatura;
    }
}
