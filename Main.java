import java.util.Scanner;

public class Main {

    static void printResult(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Scanner cleverHouse = new Scanner(System.in);

        printResult("Введите время в часах от 0 до 23 : ");
        int time = cleverHouse.nextInt();

        printResult("Введите день недели : ");
        String day = cleverHouse.next();

        printResult("Укажите включена ли сигнализация : ");
        boolean onOff = cleverHouse.nextBoolean();

        if ((time == 8) && (!onOff) && (!day.equalsIgnoreCase("Суббота")
                && (!day.equalsIgnoreCase("Воскресенье")))) {
            printResult("Поднимаю шторы в 8 часов!");

        } else if (((time == 11) && (!onOff)) &&
                ((day.equalsIgnoreCase("Суббота") || (day.equalsIgnoreCase("Воскресенье"))))) {
            printResult("Поднимаю шторы в 11 часов!");

        } else if ((time == 20) && (onOff) && (!day.equalsIgnoreCase("Суббота")
                && (!day.equalsIgnoreCase("Воскресенье")))) {
            printResult("Включаю чайник!");
        } else {
            printResult("Функция с этими данными не предусмотрена");
        }
    }
}