package ej12;

public class Test {
    public static void main(String[] args) {
        Persona pers1 = new Persona("1", "1", "1");
        Persona pers2  = new Persona("2", "2", "2");
    CuentaCorriente corriente = new CuentaCorriente(100, pers1);
        CuentaAhorro ahorro = new CuentaAhorro(0.1, 100, pers2);
        
        System.out.println(corriente.toString());
        System.out.println(ahorro.toString());
        System.out.println("----------------------");
        
        corriente.setSaldo(1000);
        corriente.actualizarSaldo();
        System.out.println(corriente.getSaldo());
        
        ahorro.setSaldo(1500);
        ahorro.actualizarSaldo();
        System.out.println(ahorro.getSaldo());
    }
}
