package Task_11_Thread;

public class Main   {
   private  static  int num;
    public static void main(String[] args) {

        //Cоздать синхронизированый метод который будет использоватся в 2 разных потоках
        Thread t1 = new Thread(new RunClass());
        Thread t2 = new Thread(new RunClass());

        t1.start();
        t2.start();

 try {
   t1.join( );
   t2.join( );
 } catch (InterruptedException e) {
     e.printStackTrace();
 }


        System.out.println(num);
    }




public  static  synchronized void  incNumb( ){
        num++;
}





    }

