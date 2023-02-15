package estructurasDeAlmacenamiento;

import java.util.*;

public class NumerosBinarios {

    public static void main(String[] args) {
        Integer[][] array = new Integer[4][4];

        boolean repeat = true;
        while (repeat) {
            fillArray(array);
            String result = findSquare(array);
            if (result == "") {
                repeat = true;
            } else {
                repeat = false;
                System.out.println(result);
                printArray(array);
            }
        }
    }

    public static void printArray(Integer[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " - ");
            }
            System.out.println("");
        }
    }

    public static void fillArray(Integer[][] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int num = rand.nextInt(2);
                array[i][j] = num;
            }
        }
    }

    public static String findSquare(Integer[][] array) {
        String volver = "";
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[0].length - 1; j++) {
                if (array[i][j] == 0) {
                    if (array[i - 1][j - 1] == 1 && array[i - 1][j + 1] == 1 && array[i + 1][j - 1] == 1 && array[i + 1][j + 1] == 1) {
                        volver = i + ";" + j + ";";
                    }
                }
            }
        }
        return volver;
    }
}
