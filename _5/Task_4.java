package lessons._5;

import java.util.Random;
public class Task_4 {
    public static void main(String[] args) {
        int[] array =new int[20];
        Random randArr = new Random();

        for(int i=0;i<array.length;i++){
            array[i] = randArr.nextInt(20); //генерация случайных чисел,где число в массиве не может превысить 20
            System.out.print(array[i] +" ");
        }
        int maxArray = array[0];
        for(int i=0;i<array.length;i++){

        if(maxArray<array[i]){ //если это условие верно, то сгенерированное число становиться максимальным, вместо назначеного элемента
            maxArray=array[i];                                                                                         // с индексом 0
        }
        }
        System.out.println("\n Максимальный элемент массива: "+maxArray);
    }
}
