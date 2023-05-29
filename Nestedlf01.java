import java.util.Scanner;

public class Nestedlf01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入月份（1-12）：");
        int month = scanner.nextInt();

        System.out.print("请输入年龄：");
        int age = scanner.nextInt();

        boolean isPeakSeason = month == 4 || month == 10;
        int ticketPrice;

        if (isPeakSeason) {
            if (age < 18) {
                ticketPrice = 20;
            } else if (age >= 18 && age <= 60) {
                ticketPrice = 60;
            } else {
                ticketPrice = 60 / 3;
            }
        } else {
            if (age < 18) {
                ticketPrice = 20 / 2 ;
            } else {
                ticketPrice = 40;
            }
        }

        System.out.println("票价为：" + ticketPrice);
    }
}
