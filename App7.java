package app;

//Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран:
// - максимальное значение*
// - сумму положительных элементов*
// - сумму четных отрицательных элементов*
// - количество положительных элементов*
// - среднее арифметическое отрицательных элементов
public class App7 {
    public static void main(String[] args){
        int[] a = new int[]{1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int max = a[0];
        int sum_pol = 0;
        int sum_chet_otr = 0;
        int col_pol = 0;
        int col_otr = 0;
        int sum_otr = 0;
        double sr_otr;
        for (int i:a){
            if (i>max){
                max = i;
            }
            if (i>0){
                sum_pol+=i;
                col_pol++;
            }
            if (i<0){
                col_otr++;
                sum_otr+=i;
                if (i%2==0){
                    sum_chet_otr+=i;
                }

            }
        }
        sr_otr = sum_otr/col_otr;
        System.out.println("максимальное значение: " + max);
        System.out.println("сумма положительных элементов: " + sum_pol);
        System.out.println("сумма четных отрицательных элементов: " + sum_chet_otr);
        System.out.println("количество положительных элементов: " + col_pol);
        System.out.println("среднее арифметическое отрицательных: " + sr_otr);

    }
}
