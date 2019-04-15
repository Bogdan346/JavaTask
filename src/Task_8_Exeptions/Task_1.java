package Task_8_Exeptions;

public class Task_1 {
    public static void main(String[] args) {
        double sum = 0;

        try {
        sum=1/0;
        }catch (Exception ex){
            System.out.println("На ноль делить нельзя");
        }
    }
}
