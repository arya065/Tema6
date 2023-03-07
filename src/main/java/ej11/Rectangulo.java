package ej11;

public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    int calcularArea() {
        return getAltura() * getBase();
    }

}
