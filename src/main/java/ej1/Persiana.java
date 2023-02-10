package ej1;

public class Persiana extends Casa {

    private String material;

    public Persiana(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Persiana{" + "material=" + material + '}';
    }

    public void subir() {
        System.out.println("persiana subida");
    }

    public void bajar() {
        System.out.println("persiana bajada");
    }
}
