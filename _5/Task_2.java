package lessons._5;

public class Task_2 {
        public static void main(String[] args) {
            int[] mass_2= new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20};
            System.out.println(withoutFifteen(mass_2, 15));
        }
        public static int withoutFifteen(int[] mass_2, int withoutFift)
        {
            final int WITHOUTFIFT=11;
            for(int i=0;i<mass_2.length;i++){
                if(mass_2[i] !=  WITHOUTFIFT )
                {
                    System.out.println("Элемент 15 отсутствует");
                    break;
                }

               else {
                    System.out.println("");
                    break;
                }

            }
                return 0;




        }

    }

