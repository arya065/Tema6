package lunes20Febrero.b;

import org.apache.commons.lang3.StringUtils;
import javax.swing.JOptionPane;
import java.util.*;
public class Ejb {

    public static void main(String[] args) {
        String ask = ask();
        System.out.println(indexOfLetter(ask, 'B'));
        System.out.println("");

        Integer[] array = massiveOfIndex(ask, 'B');
        printArray(array);
        System.out.println("");

        ask = StringUtils.deleteWhitespace(ask);
        System.out.println(ask.length());
        System.out.println(ask);
    }

    public static String ask() {
        String answer = JOptionPane.showInputDialog("Introduce frase cualquiera");
        System.out.println(answer);
        System.out.println("Longitud de frase - " + answer.length());
        return answer;
    }

    public static int indexOfLetter(String answer, char tmp) {
        return answer.indexOf(tmp);
    }

    public static Integer[] massiveOfIndex(String answer, char tmp) {
        char[] array = answer.toCharArray();
        ArrayList<Integer> tmpList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tmp) {
                tmpList.add(i);
            }
            System.out.print(array[i] + "-");
        }
        System.out.println("");
        tmpList.trimToSize();
        Integer[] volver = new Integer[tmpList.size()];
        tmpList.toArray(volver);
        return volver;
    }

    public static void printArray(Integer[] array) {
        for (int tmp : array) {
            System.out.println(tmp);
        }
    }

}
