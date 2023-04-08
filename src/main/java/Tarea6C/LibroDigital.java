package Tarea6C;

public class LibroDigital extends Libro implements SeDescarga {

    private int numKBytes;

    public LibroDigital(int numKBytes, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    @Override
    public void descargar() {
        System.out.println("http://tunombre.daw/" + this.hashCode());
    }

    @Override
    public String toString() {
        return "LibroDigital{" + "numKBytes=" + numKBytes + '}';
    }

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    void queLibroEs() {
        System.out.println("Es libro digital");
    }

}
