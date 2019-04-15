package Task_1_DataTypes;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //Вывести на экран информацию о том является ли целое
        //число записанное в переменную n, чётным либо нечётным.
        System.out.println("Введите число");
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println("Число-" + n + " Чётное");
        } else {
            System.out.println("Число-" + n + " Не чётное");
        }
    }
}
