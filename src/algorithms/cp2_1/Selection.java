package algorithms.cp2_1;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {11,53,5,74,23,523,32,1};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i+1; j < len; j++) {
                //比较次数N(N-1)/2
                if (less(arr[min],arr[j])) {

                }else {
                    min=j;
                }
            }
            //交换次数N
            exch(arr,i,min);
        }
        System.out.println(Arrays.toString(arr));
    }
    private static boolean less(int v, int w) {
        return v<=w;
    }

    private static void exch(int[] a, int i, int j) {
        Integer t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
