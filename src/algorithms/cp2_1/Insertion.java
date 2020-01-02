package algorithms.cp2_1;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {11,53,5,74,23,523,32,1,92};
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
                exch(arr, j, j - 1);
            }
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
