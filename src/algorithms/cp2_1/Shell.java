package algorithms.cp2_1;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        int[] a = {11,53,5,74,23,523,32,1};
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        //100  33    4 13
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
        System.out.println(Arrays.toString(a));
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
