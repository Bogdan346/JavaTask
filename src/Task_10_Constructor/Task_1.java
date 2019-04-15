package Task_10_Constructor;

public class Task_1 {

//    Создать дефолтный коструктор в котором будет выводится имя класса

    public Task_1() {
        System.out.println(getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Task_1 task_1 = new Task_1();
    }
}
