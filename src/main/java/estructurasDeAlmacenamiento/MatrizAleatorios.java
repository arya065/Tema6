package estructurasDeAlmacenamiento;

import java.util.*;

public class MatrizAleatorios {

    public static void main(String[] args) {
        Integer[][] array = makeArray(4);
        fillArray(array);
        printArray(array);
    }

    public static Integer[][] makeArray(int num) {
        Integer[][] volver = new Integer[num][num];
        return volver;
    }

    public static void fillArray(Integer[][] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                boolean repeat = true;
                int randNum = 0;
                while (repeat) {
                    randNum = rand.nextInt(array.length * array.length) + 1;
                    if (sameNum(array, randNum)) {
                        repeat = true;
                    } else {
                        repeat = false;
                    }
                }
                array[i][j] = randNum;
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

    public static boolean sameNum(Integer[][] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    if (array[i][j] == num) {
                        return true;
                    }
                } catch (NullPointerException e) {
                    return false;
                }
            }
        }
        return false;
    }
}
