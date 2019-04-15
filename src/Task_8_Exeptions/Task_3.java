package Task_8_Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task_3 {


    public static void main(String[] args) {

//Сделать оработку исключений с nullpointer и fileIO

        Object object = null;
     try {


         if (object.equals("knownObject")) {
             System.out.println("This may result in NullPointerException if unknownObject is null");
         }
     }catch (NullPointerException ex){
         System.out.println(ex);
     }
/////////////////////////////////////////////////////////////////////////

            File file = new File("D:\\swat-master\\JavaTask\\src\\Task_8_Exeptions\\test.txt");
            FileInputStream fileInputStream = null;
            try{
                fileInputStream = new FileInputStream(file);
                fileInputStream.read();
            }catch (IOException ex){
                System.out.println(ex);
            }


    }
}
