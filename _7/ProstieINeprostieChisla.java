package lessons._7;
import java.util.*;


public class ProstieINeprostieChisla {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Исходный массив:" + Arrays.toString(array));

        for (int j = 0; j < array.length; j++) {
            boolean b = true;
            for (int i = 2; i < array[j]; i++) {
                if (array[j] % i == 0) {
                    b = false;
                    break;

                }
                if (b) {
                    System.out.println(array[j] + " -  Простое ");
                }
                break;

            }

        }

    }

}