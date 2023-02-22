package lunes20Febrero.a;

import java.lang.instrument.*;
import javax.swing.*;

public class Eja {

    public static void main(String[] args) throws IllegalClassFormatException {
        String num = leerNum();
        Integer[] array = makeArray(num);
        printArray(array);
        System.out.println("");
        boolean recurcive = recursive(array, 6, 0);
        System.out.println(recurcive);
    }

    public static String leerNum() throws IllegalClassFormatException {
        boolean repeat = true;
        String volver;
        do {
            volver = JOptionPane.showInputDialog("Introduce numero");
            try {
                for (int i = 0; i < volver.length(); i++) {
                    char tmp = volver.charAt(i);
                    if (!Character.isDigit(tmp)) {
                        throw new IllegalClassFormatException();
                    }
                }
                repeat = false;
            } catch (IllegalClassFormatException e) {
                JOptionPane.showMessageDialog(null, "Numero incorrecto");
                repeat = true;
            }
        } while (repeat);
        return volver;
    }

    public static Integer[] makeArray(String numbers) {
        int length = numbers.length();
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            char num = numbers.charAt(i);
            int number = Character.digit(num, 10);
            array[i] = number;
        }
        return array;
    }

    public static boolean recursive(Integer[] array, int find, int i) {
        if (i < array.length) {
            if (array[i] == find) {
                return true;
            } else {
                return recursive(array, find, i + 1);
            }
        } else {
            return false;
        }
    }

    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " - ");

        }
    }
}