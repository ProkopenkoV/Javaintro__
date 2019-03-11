package lessons._5;

import java.util.*;

//---------------------------------Найти индекс элемента значение которого равно 15//-----------------------------------
public class Task_1 {
    public static void main(String[] args) {
        int[] mass =new int []{1,2,3,4,5,6,7,8,15,9,10,11,12,13,14,16,17,18,19,20};
       System.out.println("Индекс элемента значение которого равно 15 является число : " + findInd(mass, 15));

    }

        public static int findInd(int[] mass, int fifteen)
        {

            for (int i = 0; i < mass.length; i++)

                if (mass[i] == fifteen) {
                    return i;
                }

                    return -1;


        }

    }


