package app;

import java.util.Scanner;
// Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
public class App{
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int last = value %10;
        System.out.println(last);
    }
}
