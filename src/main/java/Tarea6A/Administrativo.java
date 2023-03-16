package Tarea6A;

public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellido, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.grupo = grupo;
    }

    @Override
    double calcularIRPF() {
        if (grupo.equals(grupo.C)) {
            grupo.setIrpf(0.175);
            return 0.175;
        } else if (grupo.equals(grupo.D)) {
            grupo.setIrpf(0.180);
            return 0.18;
        } else if (grupo.equals(grupo.E)) {
            grupo.setIrpf(0.185);
            return 0.185;
        } else {
            return 0;
        }
    }

    public void registrarDocumento(String nombreDoc) {
        System.out.println("Administratico" + getNombre() + " " + getApellido()
                + ":" + nombreDoc + ";" + nombreDoc.hashCode());
    }

}
