package Tarea6B;

abstract class Obra implements Comparable<Obra> {

    private int id;
    private String autor;

    public Obra(int id, String autor) {
        this.id = id;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }
}
