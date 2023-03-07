package ej11;

public class Romboide extends Figura {

    public Romboide(int base, int altura) {
        super(base, altura);
    }

    @Override
    int calcularArea() {
        return getAltura() * getBase();
    }
}
