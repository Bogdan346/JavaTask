package Task_3_Cycle;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();



        //Создать цикл forach  для массива из 10 рандомных чисел,если число равно 5 вывести в консоль

    int arr[]= new int[10] ;
        for (int i:arr){
              arr[i]=random.nextInt(10);
            System.out.println(arr[i]);
        if (arr[i]==5){
            System.out.println(arr[i]);
        }

        }

    }

}
