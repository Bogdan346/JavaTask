package Task_1_DataTypes;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число ");
        int n = in.nextByte();
        int p = 1;
        int i = 1;
        while (i < n) {

            i += 1;
            p *= i;
        }
        System.out.println("Факториал числа: " + n + " = " + p);




    }
}
