package lessons._7;

import java.util.Arrays;


public class ChetNechet {
    public static void main(String[] args) {
        int[] array_1 = new int []{51,20,34,41,56,63,70,80,98,100};
        System.out.println("Исходный массив представляет собой такую последовательность чисел "+Arrays.toString(array_1));

        for(int i=0;i<array_1.length;i++){
            if(array_1[i] %2 ==0){
                System.out.println("Число: "+array_1[i]+" - четное");
            }
            else {
                System.out.println("Число:" +array_1[i]+ " - нечетное");
            }

        }
    }
}
