public class Main {
    public static void printSeparator() {
        System.out.println("=============");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6};


        printSeparator();

        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);

        System.out.println("Homework");
        System.out.println("Task №1\n");

        checksDisplaysYearResult(2021);

        System.out.println("Task №2\n");

        printIOSAndAndroidPrograms(0,2014);

        System.out.println("Task №3\n");

        acceptsDistanceReturns(111);
    }

    public static void checksDisplaysYearResult(int copyYear) {

        if (copyYear > 1584 && (copyYear % 4 == 0 && copyYear % 100 != 0 || copyYear % 400 == 0)) {
            System.out.println(copyYear + " год является високосным");
        } else {
            System.out.println(copyYear + " год является не високосным");
        }
    }

    public static void printIOSAndAndroidPrograms(int clientCopy, int year) {
        int clientDeviceYear = 2015;
        if (clientCopy == 0 && year < clientDeviceYear) {
            System.out.println( "Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientCopy == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientCopy == 1 && year < clientDeviceYear) {
            System.out.println ("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientCopy == 1) {
            System.out.println ("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Такая система не поддерживается.");
        }

    }

    public static void acceptsDistanceReturns(int distance) {
        int days = 1;
        if (distance <= 20) {
            System.out.println("Доставка занимает: " + days + " день");
        } else if (distance > 20 && distance <= 60){
            days = days + 1;
            System.out.println("Доставка занимает: " + days + " дня");
        } else if (distance > 60 && distance <= 100){
            days = days + 1;
            System.out.println("Доставка занимает: " + days + " дня");
        } else {
            System.out.println("Доставки нет.");
        }
    }
    }
