import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner newObject = new Scanner(System.in);
        //Exercise 1
        System.out.println("Введите вашу систему: ");
        int clientOS = newObject.nextInt();

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Нет такой системы");
        }
        //Exercise 2
        System.out.println("Введите вашу систему: ");
        int clientOS2 = newObject.nextInt();
        System.out.println("Введите год выпуска вашего телефона: ");
        int clientDeviceYear = newObject.nextInt();

        if (clientOS2 == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS2 == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS2 == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOS2 == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Нет такой системы");
        }
        //Exercise 3
        System.out.println("Введите год: ");
        int year = newObject.nextInt();

        if (year > 1584 && (((year % 100) != 0 && (year % 4) == 0) || (year % 400) == 0)){
            System.out.println(year + " год является высокосным");
        }
        else{
            System.out.println(year + " год не является высокосным");
        }
        //Exercise 4
        System.out.println("Введите растояние до офиса: ");
        int deliveryDistance = newObject.nextInt();
        int daysForDelivery = 1;

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + daysForDelivery);
        }
        else if (deliveryDistance <= 60){
            deliveryDistance += 1;
            System.out.println("Потребуется дней: " + daysForDelivery);
        }
        else if (deliveryDistance <= 100){
            deliveryDistance += 2;
            System.out.println("Потребуется дней: " + daysForDelivery);
        }
        else{
            System.out.println("Доставки нет");
        }
        //Exercise 5
        System.out.println("Введите номер месяца: ");
        int monthNumber = newObject.nextInt();

        switch (monthNumber){
            case 1:
                System.out.println("Месяц зимнего сезона");
            case 2:
                System.out.println("Месяц зимнего сезона");
            case 3:
                System.out.println("Месяц весеннего сезона");
            case 4:
                System.out.println("Месяц весеннего сезона");
            case 5:
                System.out.println("Месяц весеннего сезона");
            case 6:
                System.out.println("Месяц летнего сезона");
            case 7:
                System.out.println("Месяц летнего сезона");
            case 8:
                System.out.println("Месяц летнего сезона");
            case 9:
                System.out.println("Месяц осеннего сезона");
            case 10:
                System.out.println("Месяц осеннего сезона");
            case 11:
                System.out.println("Месяц осеннего сезона");
            case 12:
                System.out.println("Месяц зимнего сезона");
            default:
                System.out.println("Нет такого месяца");
        }
    }
}