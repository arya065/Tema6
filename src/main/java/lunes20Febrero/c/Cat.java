package lunes20Febrero.c;

public class Cat extends Pet {

    private String colorCat;

    public Cat(String colorCat, int age, int mass) {
        super(age, mass);
        this.colorCat = colorCat;
    }

    public void purr() {
        System.out.println("Purr Purr");
    }

    @Override
    public void sleep() {
        System.out.println("Cat Sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" + "age=" + getAge() + ", mass=" + getMass() + '}' + "Cat{" + "colorCat=" + colorCat + '}';
    }

}
