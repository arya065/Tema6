package Tarea6C;

public final class Musica extends Producto {

    private String grupo;

    public Musica(int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Musica{" + "grupo=" + grupo + '}';
    }

}
