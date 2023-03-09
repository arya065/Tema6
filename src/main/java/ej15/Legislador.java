package ej15;

abstract class Legislador extends Persona {

    private String provinciaQueRepresenta;
    private String partidoPolitico;

    public Legislador(String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellido) {
        super(nombre, apellido);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return "Legislador{" + "provinciaQueRepresenta=" + provinciaQueRepresenta + ", partidoPolitico=" + partidoPolitico + '}';
    }

    abstract String getCamaraEnQueTrabaja();// показывает является ли сенатором или депутатом

}
