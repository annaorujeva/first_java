package app;

import java.util.Scanner;

//Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число», «положительное
//нечетное число» и т. д.
public class App5 {
    public static void main(String[] args){
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String desc;
        if (value==0){
            desc = "Нулевое значение";
        }
        else if ((value>0)&&(value%2==0)){
            desc = "Четное положительное значение";
        }
        else if ((value>0)&&(value%2!=0)){
            desc = "Нечетное положительное значение";
        }
        else if ((value<0)&&(value%2==0)){
            desc = "Четное отрицательное значение";
        }
        else{
            desc = "Нечетное отрицательное значение";
        }
        System.out.println(desc);
    }
}
