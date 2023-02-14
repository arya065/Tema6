package estructurasDeAlmacenamiento;

import java.util.HashMap;

public class TrenesMap {

    public static void main(String[] args) {
        Integer[][] array = new Integer[3][3];
        //tren 1
        array[0][0] = 101;
        array[0][1] = 50;
        array[0][2] = 80;
        //tren 2
        array[1][0] = 102;
        array[1][1] = 80;
        array[1][2] = 80;
        //tren 3
        array[2][0] = 103;
        array[2][1] = 60;
        array[2][2] = 0;
        printArray(array);

        HashMap<Integer, Trenes> structure = new HashMap<>();
        structure = fillMap(structure, array);
        System.out.println(structure.toString());

    }

    public static void printArray(Integer[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " - ");
            }
            System.out.println("");
        }
    }

    public static HashMap<Integer, Trenes> fillMap(HashMap<Integer, Trenes> structure, Integer[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int key = array[i][0];
                int numVagones = array.length - 1;
                int numPasajerosTotal = 0;
                for (int k = 1; k < array.length; k++) {
                    numPasajerosTotal += array[i][k];
                }
                Trenes tmp = new Trenes(key, numVagones, numPasajerosTotal);
                structure.put(key, tmp);
            }
        }
        return structure;
    }

}
