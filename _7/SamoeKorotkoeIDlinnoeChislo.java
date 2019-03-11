package lessons._7;
import java.util.Arrays;

public class SamoeKorotkoeIDlinnoeChislo {
        public static void main(String[] args) {
            int numbers[] = {21, 163, 98, 65, 192};

            int longestNumber = 0;
            int longestNumberLength = Integer.MIN_VALUE;

            int shortestNumber = 0;
            int shortestNumberLength = Integer.MAX_VALUE;

            for (int current : numbers) {
                int currentNumber = current;
                int currentNumberLength = 0;

                while (current != 0) {
                    int currentDigit = current % 10;
                    current -= currentDigit;
                    current /= 10;
                    currentNumberLength++;
                }
                if (currentNumberLength >= longestNumberLength) {
                    longestNumber = currentNumber;
                    longestNumberLength = currentNumberLength;
                }
                if (currentNumberLength <= shortestNumberLength) {
                    shortestNumber = currentNumber;
                    shortestNumberLength = currentNumberLength;
                }

            }
            System.out.println("The longest number: " + longestNumber + " " );
            System.out.println("The shortest number: " + shortestNumber + " ");
        }
    }


