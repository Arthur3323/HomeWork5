public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Решение задачи 1:");

        int clientOS = 0;

        int iOS = 0;
        String textIos = "Установите версию приложения для iOS по ссылке";
        String textAndroid = "Установите версию приложения для Android по ссылке";
        boolean isClientOS = clientOS == iOS;

        if (isClientOS) {
            System.out.println(textIos);
        } else {
            System.out.println(textAndroid);
        }

        // Задача 2
        System.out.println("\nРешение задачи 2:");

        int clientDeviceYear = 2015;

        int lightVersion = 2015;
        String textIosLight = "Установите облегченную версию приложения для iOS по ссылке";
        String textAndroidLight = "Установите облегченную версию приложения для Android по ссылке";
        boolean isLightVersion = clientDeviceYear <= lightVersion;

        if (isClientOS) {
            if (isLightVersion) {
                System.out.println(textIosLight);
            } else {
                System.out.println(textIos);
            }
        } else {
            if (isLightVersion) {
                System.out.println(textAndroidLight);
            } else {
                System.out.println(textAndroid);
            }
        }
        // Задача 3
        System.out.println("\nРешение задачи 3:");

        int year = 2014;

        int yearMustBeMore = 1584;
        String leapYearText = "  год является високосным";
        String noLeapYearText = "  год не является високосным";
        int fourthYear = 4;
        int hundredthYear = 100;
        int fourthHundredYear = 400;

        int isFourthYear = year % fourthYear;
        int isHundredYear = year % hundredthYear;
        int isFourthHundredYear = year % fourthHundredYear;

        boolean isYearMore = year >= yearMustBeMore;
        boolean isFourthLeapYear = isFourthYear == 0;
        boolean isHundredLeapYear = isHundredYear == 0;
        boolean isFourthHundredLeapYear = isFourthHundredYear == 0;


        if (isYearMore) {
            if (isHundredLeapYear) {
                if (isFourthHundredLeapYear) System.out.println(leapYearText);
                else {
                    System.out.println(noLeapYearText);
                }
            } else {
                if (isFourthLeapYear) {
                    System.out.println(leapYearText);
                } else {
                    System.out.println(noLeapYearText);
                }
            }
        } else {
            System.out.println("Введите год больше чем 1584");
        }

        // Задача 4
        System.out.println("\nРешение задачи 4:");

        int deliveryDistance = 101;
        int diliveryDay = 1;
        String diliveryText = "Потребуется дней: ";
        String noDiliveryText = "доставки нет";


        if (deliveryDistance >= 100) {
            System.out.println(noDiliveryText);
        } else if (deliveryDistance <= 20) {
            System.out.println(diliveryText + diliveryDay);
        } else if (deliveryDistance >= 20) {
            diliveryDay++;
            if (deliveryDistance >= 60) {
                diliveryDay++;
            }
            System.out.println(diliveryText + diliveryDay);
        }

        // Задача 5
        System.out.println("\nРешение задачи 5:");


        int numberOfMonth = 13;

        String winter = "принадлежит к сезону зима";
        String spring = "принадлежит к сезону весна";
        String summer = "принадлежит к сезону лето";
        String autumn = "принадлежит к сезону осень";


        switch (numberOfMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println(winter);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(spring);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(summer);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(autumn);
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}

