package ej2;

public class Jardinero extends Empleado {

    private String antiguedad;

    public Jardinero(String characteristic, int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.antiguedad = characteristic;
    }

    public String getCharacteristic() {
        return antiguedad;
    }

    public void setCharacteristic(String characteristic) {
        this.antiguedad = characteristic;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "characteristic=" + antiguedad + '}';
    }
    

    @Override
    public int compareTo(Persona o) {
        return this.antiguedad.compareTo(o.);
    }
    
}
