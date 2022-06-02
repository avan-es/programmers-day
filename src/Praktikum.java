import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        //Вызов метода определения високосности года. True - 12.09, False - 13.09
        if (isLeapYear(year)) {
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }
    // Метод определяет високосность года по условиям ДЛЯ КОММИТА
    public static boolean isLeapYear(int year) {
        //Если год (кратный 4 но некратный  100) или (кратный 400) - то он високосный, иначе - нет
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}