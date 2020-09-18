package app;

import java.util.Scanner;

//Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города. ( Москва(905) - 4.15руб.
//Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ). Пользователь в консоли должен ввести код города, а в ответ от программы
//получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
public class App6 {
    public static void main(String[] args){
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        double cost;
        switch (value){
            case 905:
                cost = 10*4.15;
                System.out.print("Москва. Стоимость разговора: ");
                System.out.print(cost);
                break;
            case 194:
                cost = 10*1.98;
                System.out.print("Ростов. Стоимость разговора: ");
                System.out.print(cost);
                break;
            case 800:
                cost = 10*5;
                System.out.print("Киров. Стоимость разговора: ");
                System.out.print(cost);
                break;
            case 491:
                cost = 10*2.69;
                System.out.print("Краснодар. Стоимость разговора: ");
                System.out.print(cost);
                break;
        }

    }
}
