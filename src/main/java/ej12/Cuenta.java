package ej12;

import java.util.*;

abstract class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        this.numeroCuenta = generarCuenta();
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String generarCuenta() {
        Random rand = new Random();
        String volver = "";
        for (int i = 0; i < 20; i++) {
            volver += rand.nextInt(10) - 1;
        }
        return volver;
    }

    abstract void actualizarSaldo();

    abstract double retirar(double summ);

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

}
