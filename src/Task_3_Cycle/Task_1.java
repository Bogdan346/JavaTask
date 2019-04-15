package Task_3_Cycle;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

       // Создать метод который будет работать как факториал



        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextByte();
        System.out.println("Факториал числа: " + num + " = " + fac(num));
    }

    public static int fac(int n) {

        if (n == 1)
            return 1;

        return n * fac(n - 1);
    }
}