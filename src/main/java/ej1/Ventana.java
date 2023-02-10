package ej1;

public class Ventana extends Casa {

    private int height;
    private int width;

    public Ventana(int height, int width) {
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

    @Override
    public String toString() {
        return "Ventana{" + "height=" + height + ", width=" + width + '}';
    }

    public void abrirVentana() {
        System.out.println("ventana abierta");
    }

    public void cerrarVentana() {
        System.out.println("ventana cerrada");
    }
}
