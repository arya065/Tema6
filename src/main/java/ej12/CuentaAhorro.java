package ej12;

public class CuentaAhorro extends Cuenta {
    
    private double interes;
    private double comisionAnual;
    
    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }
    
    @Override
    void actualizarSaldo() {
        setSaldo(getSaldo() + (getSaldo() * interes) - comisionAnual);
    }
    
    @Override
    double retirar(double summ) {
        return summ;
    }
    
    public double getInteres() {
        return interes;
    }
    
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public double getComision() {
        return comisionAnual;
    }
    
    public void setComision(double comision) {
        this.comisionAnual = comision;
    }
    
    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comision=" + comisionAnual + '}';
    }
    
}
