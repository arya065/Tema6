package ej2;

public class Prueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("persona1", "nif1", 20);
        Empleado empleado1 = new Empleado(1000, "persona2", "nif2", 21);
        Programador programador1 = new Programador(Programador.categori.ANALISTA, 1001, "persona3", "nif3", 22);
        Programador programador2 = new Programador(Programador.categori.SENIOR, 2000, "persona4", "nif4", 23);

        persona1.getEdad();
        
        empleado1.getEdad();
        empleado1.subirSalario(10);
        
        programador1.getEdad();
        programador1.subirSalario(10);
        programador1.getCategoria();
        
    }
}
