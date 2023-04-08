package Tarea6C;

abstract class Ropa extends Producto implements SeEnvia {

    private String marca;

    public Ropa(String marca, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Direccion es " + direccion + " clase de Producto es "
                + this.getClass() + "\n" + "Info de producto " + this.toString());
    }

}
