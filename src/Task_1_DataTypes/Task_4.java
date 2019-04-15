package Task_1_DataTypes;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        //Вывести цену за определенный товар опираясь на его код
        //(предусмотреть возможность введение неверного кода).

        System.out.println("Введите код товара");

        Scanner in = new Scanner(System.in);
        String choose = in.nextLine();

        switch (choose) {
            case "111":
                System.out.println(" цена на товар с кодом " + " '" + choose + "' " + " =1000 грн");
                break;
            case "222":
                System.out.println(" цена на товар с кодом " + " '" + choose + "' " + " =1245 грн");
                break;
            case "333":
                System.out.println(" цена на товар с кодом " + " '" + choose + "' " + " =15413 грн");
                break;
            case "444":
                System.out.println(" цена на товар с кодом " + " '" + choose + "' " + " =34532 грн");
                break;
            case "#555":
                System.out.println(" цена на товар с кодом " + " '" + choose + "' " + " =1345 грн");
                break;
            case "666":
                System.out.println(" цена на товар с кодом " + " '" + choose + "' " + " =15643 грн");
                break;
            default:
                System.out.println("Введен не верный код ! ");

        }

    }
    }
