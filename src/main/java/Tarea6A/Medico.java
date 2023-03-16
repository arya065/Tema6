package Tarea6A;

public class Medico extends Empleado implements Nadador {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellido, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.especialidad = especialidad;
    }

    public void tratar(Paciente paciente, String medicina) {
        System.out.println("Medico " + getNombre() + " " + getApellido() + " trata "
                + paciente.getNombre() + " " + paciente.getApellido()
                + " con " + medicina);
    }

    public double calcularIRPF() {
        if (especialidad.equalsIgnoreCase("cirigia")) {
            return 0.25;
        }
        return 0.235;
    }

    @Override
    public void swim() {
        System.out.println("Soy nadador");
    }
}
