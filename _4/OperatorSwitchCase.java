package lessons._4;
import java.util.Scanner;

public class OperatorSwitchCase {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца ");
        Scanner num_month =new Scanner(System.in);
        int month = num_month.nextInt();

        switch (month){
            case 1:
                System.out.println("Введенный месяц под номером " + month +" называется январь");
                break;
            case 2:
                System.out.println("Введенный месяц под номером " + month +" называется февраль");
                break;
            case 3:
                System.out.println("Введенный месяц под номером " + month +" называется март");
                break;
            case 4:
                System.out.println("Введенный месяц под номером " + month +" называется апрель");
                break;
            case 5:
                System.out.println("Введенный месяц под номером " + month +" называется май");
                break;
            case 6:
                System.out.println("Введенный месяц под номером " + month +" называется июнь");
                break;
            case 7:
                System.out.println("Введенный месяц под номером " + month +" называется июль");
                break;
            case 8:
                System.out.println("Введенный месяц под номером " + month +" называется август");
                break;
            case 9:
                System.out.println("Введенный месяц под номером " + month +" называется сентябрь");
                break;
            case 10:
                System.out.println("Введенный месяц под номером " + month +" называется октябрь");
                break;
            case 11:
                System.out.println("Введенный месяц под номером " + month +" называется ноябрь");
                break;
            case 12:
                System.out.println("Введенный месяц под номером " + month +" называется декабрь");
                break;

            default:
                System.out.println("Такого месяца не существует ");
                break;
        }
    }


}

