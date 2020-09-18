package app;

//Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
// Переместить нули в конец массива. Вывести результат в консоль
public class App9 {
    public static void main(String[] args){
        int[] a = new int[]{15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        for (int i=0;i<a.length;i++){
            if (a[i]==0){
                for (int j=i+1;j<a.length;j++){
                    int t = a[j];
                    a[j] = a[j-1];
                    a[j-1]=t;
                }
            }

        }
        for (int b:a){
            System.out.println(b);
        }
    }
}
