package lessons._7;


import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] array_2=new int[]{21,14,112,32,45,67,87,1,71};

        System.out.println( Arrays.toString(array_2));

        int maxArray = array_2[0]; //принимаем первое число массива ,по умолчанию, за максимальный элемент
        for(int i=0;i<array_2.length;i++){

            if(maxArray<array_2[i]){ //если это условие верно, то сгенерированное число становиться максимальным, вместо назначеного элемента
                maxArray=array_2[i];                                                                                         // с индексом 0
            }
        }
        System.out.println("Максимальный элемент массива: "+maxArray);
    }
}

