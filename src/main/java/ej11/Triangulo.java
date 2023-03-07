package ej11;


public class Triangulo extends Figura{

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    int calcularArea() {
        return getAltura()*getBase()/2;
    }
    
}
