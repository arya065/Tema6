package lunes20Febrero.c;

public abstract class Pet {

    private int age;
    private int mass;

    abstract void sleep();

    public Pet(int age, int mass) {
        this.age = age;
        this.mass = mass;
    }

    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{" + "age=" + age + ", mass=" + mass + '}';
    }

    public int getAge() {
        return age;
    }

    public int getMass() {
        return mass;
    }

}
