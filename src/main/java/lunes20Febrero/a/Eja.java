package lunes20Febrero.a;

import java.lang.instrument.IllegalClassFormatException;
import java.util.*;
import javax.swing.JOptionPane;

public class Eja {

    public static void main(String[] args) {

    }

    public static String leerNum() throws IllegalClassFormatException {
        boolean repeat = true;
        String volver;
        do {
            volver = JOptionPane.showInputDialog("Introduce numero");
            try {
                for (int i = 0; i < volver.length(); i++) {
                    char tmp = volver.charAt(i);
                    if (Character.isDigit(tmp)) {
                        throw new IllegalClassFormatException();
                    }
                }
                repeat = false;
            } catch (IllegalFormatException e) {
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
            int number = (int) num;
            array[i] = number;
        }
        return array;
    }

//    public static boolean recursive(Integer[] array) {
//        boolean volver = true;
//        if()
//        return volver;
//    }
}
//Считывает число с клавиатуры с помощью JOption. Если это не число, его следует прочитать еще раз.
//Преобразует прочитанное число в массив символов. Он реализует рекурсивный метод, позволяющий узнать,
//содержит ли массив символов какое-либо условное число.
