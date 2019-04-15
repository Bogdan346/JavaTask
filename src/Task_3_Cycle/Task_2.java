package Task_3_Cycle;

public class Task_2 {
    public static void main(String[] args) {



       // Создать цикл с послеусловием и с перед условием который будет выводить число а, пока оно не станет менше 10
        int number = 50;

        while (number > 10) {
            number--;
            System.out.println(number);
        }


        do {
            number--;
            System.out.println(number);
        } while (number > 10);
    }

}