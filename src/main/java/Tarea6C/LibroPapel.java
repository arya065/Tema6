package Tarea6C;

public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel(int numPaginas, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Direccion es " + direccion + " clase de Producto es "
                + this.getClass() + "\n" + "Info de producto " + this.toString());
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "LibroPapel{" + "numPaginas=" + numPaginas + '}';
    }

    @Override
    void queLibroEs() {
        System.out.println("Es libro papel");
    }
    

}
