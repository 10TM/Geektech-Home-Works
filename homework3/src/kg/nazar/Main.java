package kg.nazar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nambers = {-4.2, 3.3, 1.6, -8.8, 2.3, 4.2, -16.7, 2.2, -14.1, 6.2, 2.1, -48.3, 5.6, -66.2, -88, 4};
        double lang = 0;
        int reac = 0;
        boolean bool = false;
        for (double f : nambers) {
            if (f < 0) {
                bool = true;
            } else if (bool) {
                reac++;
                lang += f;
            }
        }
        System.out.println(lang / reac);


        int[]arrays={-4,-2,6,8,3,2};
        bubbleSort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}