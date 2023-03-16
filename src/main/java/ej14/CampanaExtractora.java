package ej14;

public class CampanaExtractora extends Electrodomestico {

    private int decibelios; // mas de 50dB  

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios < 50) {
            this.decibelios = 50;
        } else {
            this.decibelios = decibelios;
        }
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }

}
