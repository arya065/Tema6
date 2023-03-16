package ej1;

public class Puerta  {

    private int height;
    private int width;

    public Puerta(int height, int width) {

        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void abrirPuerta() {
        System.out.println("Puerta abierta");
    }

    public void cerrarPuerta() {
        System.out.println("Puerta serrada");
    }

    @Override
    public String toString() {
        return "Puerta{" + "height=" + height + ", width=" + width + '}';
    }

}
