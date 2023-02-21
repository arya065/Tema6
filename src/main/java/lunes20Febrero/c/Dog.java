package lunes20Febrero.c;

public class Dog extends Pet {

    private String colorDog;

    public Dog(String colorDog, int age, int mass) {
        super(age, mass);
        this.colorDog = colorDog;
    }

    public void bark() {
        System.out.println("Bark Bark");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Sleeping");
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + getAge() + ", mass=" + getMass() + '}' + "Dog{" + "colorDog=" + colorDog + '}';
    }

}
