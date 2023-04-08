package Tarea6C;

import java.util.Objects;

abstract class Libro extends Producto implements Comparable<Libro> {

    private String isbn;

    public Libro(String isbn, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Libro o) {
        return getIsbn().compareTo(o.getIsbn());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    abstract void queLibroEs();

}
