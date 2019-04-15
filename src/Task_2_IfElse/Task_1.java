package Task_2_IfElse;

public class Task_1 {
    public static void main(String[] args) {


        /*Если время от 8 до 12 и денег больше 10 то идем в магазин,
        если время больше 12 и денег больше 50 идем в кафе
        если денег меьше 50 и время меньше 19 то идем к соседу,
        если  время больше 19 и меньше 22 то смотрим телевизор,
                если больше 22 то идем спать
        Результат выводим в консоль*/

        int time = 11;
        int money = 22;

if(time >= 8 && time <= 12 && money>10){
    System.out.println("Go to shop");
} else if(time>12&&money>50){
    System.out.println("Go to caffe");
}else if (money<50 && time<19){
    System.out.println("Go to neighbour");
}else if (time>19&&money<22){
    System.out.println("Watch TV");
}


    }
}
