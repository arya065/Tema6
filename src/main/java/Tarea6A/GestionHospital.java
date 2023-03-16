package Tarea6A;

import java.time.LocalDateTime;
import java.util.*;

public class GestionHospital {

    public static void main(String[] args) {
        /*
        В главном () вы должны создать больницу, 
        нанять пять сотрудников (2 врача и 3 администратора) и принять 5 пациентов.
        Из числа врачей и пациентов больницы вы случайным образом выбираете врача и пациента,
        чтобы этот врач лечил этого пациента панцетамолом :).
        Он запускает абстрактный метод для всех сотрудников.
        Продлевает ИНН любому пациенту.
         */
        boolean fail = true;
        do {
            try{
            Hospital hospital = new Hospital("hospital", "calle hospital", 10);

            hospital.contratarEmpleado(crearMedico(111111111, LocalDateTime.now(), "cirigia", "doc1", "doc1", "doc1", 1000));
            hospital.contratarEmpleado(crearMedico(22222222, LocalDateTime.now(), "algo", "doc2", "doc2", "doc2", 1000));
            hospital.contratarEmpleado(crearPersonalPAS(333333333, LocalDateTime.now(), Grupo.C, "pas1", "pas1", "pas1", 1000));
            hospital.contratarEmpleado(crearPersonalPAS(444444444, LocalDateTime.now(), Grupo.D, "pas2", "pas2", "pas2", 1000));
            hospital.contratarEmpleado(crearPersonalPAS(555555555, LocalDateTime.now(), Grupo.E, "pas3", "pas3", "pas3", 1000));

            hospital.ingresarPaciente(crearPaciente(666666666, LocalDateTime.now(), "1", "paciente1", "paciente1"));
            hospital.ingresarPaciente(crearPaciente(777777777, LocalDateTime.now(), "2", "paciente2", "paciente2"));
            hospital.ingresarPaciente(crearPaciente(888888888, LocalDateTime.now(), "3", "paciente3", "paciente3"));
            hospital.ingresarPaciente(crearPaciente(999999999, LocalDateTime.now(), "4", "paciente4", "paciente4"));
            hospital.ingresarPaciente(crearPaciente(000000001, LocalDateTime.now(), "5", "paciente5", "paciente5"));

            Random in = new Random();
            int doc = in.nextInt(2);
            int pac = in.nextInt(3);
            ArrayList<Paciente> listPacientes = hospital.getListPacientes();
            ArrayList<Empleado> listEmpleado = hospital.getListEmpleados();
            ArrayList<Medico> listMedico = new ArrayList<>(2);

            for (int i = 0; i < listEmpleado.size(); i++) {
                if (listEmpleado.get(i).getClass().equals(Medico.class)) {
                    listMedico.add((Medico) listEmpleado.get(i));
                }
            }

            listMedico.get(doc).tratar(listPacientes.get(pac), "Pancetamol");

            listEmpleado.forEach(s -> s.calcularIRPF());

            listPacientes.get(pac).renovarNif(LocalDateTime.now().plusYears(5));
            } catch (IndexOutOfBoundsException e){
                fail = false;
            }
        } while (true);
    }

    public static Paciente crearPaciente(int numero, LocalDateTime fechaCaducidad, String numeroHistoria, String nombre, String apellido) {
        NIF tmp = new NIF(numero, fechaCaducidad);
        Paciente paciente = new Paciente(numeroHistoria, nombre, apellido, tmp);
        return paciente;

    }

    public static Medico crearMedico(int numero, LocalDateTime fechaCaducidad, String especialidad, String Seguridad, String nombre, String apellido, int salario) {
        NIF tmp = new NIF(numero, fechaCaducidad);
        Medico medico = new Medico(especialidad, Seguridad, salario, nombre, apellido, tmp);
        return medico;
    }

    public static Administrativo crearPersonalPAS(int numero, LocalDateTime fechaCaducidad, Grupo grupo, String Seguridad, String nombre, String apellido, int salario) {
        NIF tmp = new NIF(numero, fechaCaducidad);
        Administrativo adm = new Administrativo(grupo, Seguridad, salario, nombre, apellido, tmp);
        return adm;
    }
}
