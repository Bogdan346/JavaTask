package Task_11_Thread;

public class RunClass  implements  Runnable{
    //Cоздать синхронизированый метод который будет использоватся в 2 разных потоках
    @Override
    public void run() {
        for (int i = 0; i <2000 ; i++) {
            Main.incNumb();
        }
    }
}
