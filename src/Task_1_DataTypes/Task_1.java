package Task_1_DataTypes;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Посчитать среднее арифметическое массива.

        int mass[] = new int[]{1, 23, 11, 2, 5, 7};

        int sum = 0;
        int averge = 0;

        for (int i = 0; i < mass.length; i++) {

            sum += mass[i];
            averge = sum / mass.length;
        }
        System.out.println("Среднее арифметическое =   " + averge);


    }

}

