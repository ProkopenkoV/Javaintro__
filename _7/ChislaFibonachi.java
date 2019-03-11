package lessons._7;


public class ChislaFibonachi {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int third;

        System.out.print("Ряд Фибоначчи из 20 первых чисел представляет собой следующую последовательность чисел: "+first+" "+second+" ");
        for(int i = 3; i <= 20; i++){

            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;


        }
        System.out.println();
    }
}

