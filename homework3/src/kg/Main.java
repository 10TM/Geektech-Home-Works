package kg;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        double[] N = {3.0, -6.0, 11.0, -2.0, -13.0, 6.0, 11.0, 5.0, -3.0, 34.0, -24.0, -17.0, 34.0, 55.0, -100.00};
        System.out.println(Arrays.toString(N));

        //Задание 2
        double fn = 0;
        double sum = 0;
        double count = 0;
        for (double v : N) {
            count++;
            if (v == 0) {
                count++;
                sum += v;
            }
            if (v < 0) {
                fn = v;
                for (int j = 0; j < N.length - count; j++) {
                    sum += N[j];
                }
                break;
            }
        }
        System.out.println(fn);
        System.out.println(sum/count);

//        double sum = 0;
//        double count = 0;
//        for (double v : N) {
//            if (v > 0) {
//                count++;
//                sum += v;
//            }
//        }
//        System.out.println("Средне-арифметическое значение положительных чисел: " + (sum / count));

        //Задание 3
        System.out.println("Финальная вид отсартированного массива: " + Arrays.toString(sort()));

    }

    public static double[] sort() {
        double[] N = {3.0, -6.0, 11.0, -2.0, -13.0, 6.0, 11.0, 5.0, -3.0, 34.0, -24.0, -17.0, 34.0, 55.0, -100.00};
        for (int j = 0; j < N.length; j++) {
            double min = N[j];
            int nmin = j;
            for (int k = j + 1; k < N.length; k++) {
                if (N[k] < min) {
                    min = N[k];
                    nmin = k;
                }
            }
            if (j != nmin) {
                double tmp = N[j];
                N[j] = N[nmin];
                N[nmin] = tmp;
            }
            System.out.println("Процесс сортировки: " + Arrays.toString(N));
            System.out.println("------------------------------------------");

        }
        return N;
    }
}