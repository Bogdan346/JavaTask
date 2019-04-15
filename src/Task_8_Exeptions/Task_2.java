package Task_8_Exeptions;

public class Task_2 {
    public static void main(String[] args) {
        double sum = 0;

        try {
            sum=1/0;
        }finally {
            System.out.println("На ноль делить нельзя");
        }
    }
    }

