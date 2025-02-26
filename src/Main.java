public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        int year = 2021;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if (year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + "год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }


        int deliveryDistance = 95;
        int daysDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + daysDelivery);
        } else if (deliveryDistance <= 60) {
            daysDelivery += 1;
            System.out.println("Потребуется дней: " + daysDelivery);
        } else if (deliveryDistance <= 100) {
            daysDelivery += 2;
            System.out.println("Потребуется дней: " + daysDelivery);
        } else {
            System.out.println("Доставки нет");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Месяцев всего 12");
        }


    }
}