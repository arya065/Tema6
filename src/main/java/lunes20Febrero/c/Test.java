package lunes20Febrero.c;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Pet pet1 = new Dog("white", 5, 1);
        Pet pet2 = new Cat("Green", 2, 2);
        Dog dog = new Dog("Black", 4, 3);
        Cat cat = new Cat("Black", 3, 4);
        Pet pet3 = new Dog("Black", 5, 10);
        ArrayList<Pet> list = new ArrayList<>();
        list.add(pet1);
        list.add(pet2);
        list.add(dog);
        list.add(cat);
        print(list);
        System.out.println("__________________________");
        cicle(list);
        System.out.println("__________________________");
        list = sort(list);
        print(list);
        System.out.println("__________________________");
        search(list, pet3);

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
        Comparator<Pet> filter = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Collections.sort(list, filter);
        return list;
    }

    public static void search(ArrayList<Pet> list, Pet obj) {
        for (Pet tmp : list) {
            if (tmp.getMass() == obj.getMass()) {
                System.out.println("Success");
                System.out.println(tmp.toString());
            }
        }
    }

    public static void print(ArrayList<Pet> list) {
        for (Pet tmp : list) {
            System.out.println(tmp.toString());
        }
    }
}
