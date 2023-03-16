package ej14;

public class Microondas extends Electrodomestico implements Silencioso {

    private int potencia;

    public Microondas(int potencia, double consumo, String modelo) {
        super(consumo, modelo);
        this.potencia = potencia;
    }

    @Override
    public void silencio() {
        System.out.println("El microonda de este modelo emite 40 dB");
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Microondas{" + "potencia=" + potencia + '}';
    }

}
