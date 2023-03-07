package ej12;

public class CuentaCorriente extends Cuenta {

    private final double interes;//1.5%
    private double saldoMinimo;

    public CuentaCorriente(double saldoMinimo, Persona cliente) {
        super(cliente);
        this.interes = 0.015;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    void actualizarSaldo() {
        if (getSaldo() >= 1000) {
            setSaldo(getSaldo() + (saldoMinimo * interes));
        } else {
            setSaldo(getSaldo() + getSaldo() + interes);
        }
    }

    @Override
    double retirar(double summ) {
        if (getSaldo() < saldoMinimo) {
            System.out.println("No se puede retirar");
            return 0;
        } else {
            return summ;
        }
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "interes=" + interes + ", saldoMinimo=" + saldoMinimo + '}';
    }

}
