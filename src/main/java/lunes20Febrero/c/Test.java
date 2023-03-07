package lunes20Febrero.c;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Pet pet1 = new Dog("white", 1, 1);
        Pet pet2 = new Cat("Green", 2, 2);
        Dog dog = new Dog("Black", 3, 3);
        Cat cat = new Cat("Black", 4, 4);
        ArrayList<Pet> list = new ArrayList<>();
        list.add(pet1);
        list.add(pet2);
        list.add(dog);
        list.add(cat);
        cicle(list);
    }

    public static void cicle(ArrayList<Pet> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getAge());
            System.out.println(list.get(i).getMass());
            list.get(i).sleep();
            System.out.println(list.get(i).toString());
            try {
                ((Cat) list.get(i)).purr();
            } catch (ClassCastException e) {
                System.out.println("Error, metodo no puede utilizar para este clase");
            }
            try {
                ((Dog) list.get(i)).bark();
            } catch (ClassCastException e) {
                System.out.println("Error, metodo no puede utilizar para este clase");
            }
            System.out.println("------------------------");
        }
    }

    public static ArrayList<Pet> sort(ArrayList<Pet> list) {
        return list;
    }

    public static void search(ArrayList<Pet> list, Pet obj) {
        for (Pet tmp : list) {
            if (tmp.equals(obj)) {
                System.out.println(tmp.toString());
            }
        }
    }
}
