package Tarea6C;

public final class Pantalon extends Ropa {

    private int talla;

    public Pantalon(int talla, String marca, int codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "talla=" + talla + '}';
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

}
