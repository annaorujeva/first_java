package app;

import java.util.Scanner;
//Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести
//полученное число
public class App2 {
    public static void main(String[] args){
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value>0){
            value++;
        }
        System.out.println(value);
    }
}
