package lessons._7;


public class VivodChiselSlevaNapravo {

        public static void main(String[] args) {
            int k = 100;
            int n = 1;
            while (Math.pow(n,2) < k) {

                n++;
            }
            int currentNumber = 1;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    if (currentNumber <= k) {
                        System.out.print((currentNumber++) + "\t");
                    }
                }
                System.out.println();
            }
        }

    }

