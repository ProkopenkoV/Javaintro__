package lessons._4;
import java.util.Scanner; //импорт сканера из пакета util с указанием класса Scanner

public class OperatorIfElse {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца ");
        Scanner num_month = new Scanner(System.in); //объявление ссылки на класс Scanner

        int month = num_month.nextInt(); // создание объекта ссылающегося на переменную-ссылку num_month с методом nextInt, к-й считывает введенное число int

        if (month==1) {
            System.out.println("Введенный месяц под номером " + month +" называется январь");
        }

        else if(month==2){
            System.out.println("Введенный месяц под номером " + month +" называется февраль");

        }
        else if(month==3){
            System.out.println("Введенный месяц под номером " + month +" называется март");

        }
        else if(month==4){
            System.out.println("Введенный месяц под номером " + month +" называется апрель");

        }
        else if(month==5){
            System.out.println("Введенный месяц под номером " + month +" называется май");

        }
        else if(month==6){
            System.out.println("Введенный месяц под номером " + month +" называется июнь");

        }
        else if(month==7){
            System.out.println("Введенный месяц под номером " + month +" называется июль");

        }
        else if(month==8){
            System.out.println("Введенный месяц под номером " + month +" называется август");

        }
        else if(month==9){
            System.out.println("Введенный месяц под номером " + month +" называется сентябрь");

        }
        else if(month==10){
            System.out.println("Введенный месяц под номером " + month +" называется октябрь");

        }
        else if(month==11){
            System.out.println("Введенный месяц под номером " + month +" называется ноябрь");

        }else if(month==12){
            System.out.println("Введенный месяц под номером " + month +" называется декабрь");

        }
        else{
            System.out.println("Такого месяца не существует");
        }
    }
}
