package ej2;

public class Trabajador extends Empleado {

    private String characteristic;

    public Trabajador(String characteristic, int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "characteristic=" + characteristic + '}';
    }
    

    @Override
    public int compareTo(Persona o) {
        return this.characteristic.compareTo(o.);
    }
    
}
