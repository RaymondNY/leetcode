package algorithms.cp2_1;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,4,69,8,12,33};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low,int hign){
        if (low >= hign) return;
        int j = findPivot(arr,low,hign);
        sort(arr,low,j-1);
        sort(arr,j+1,hign);
    }

    public static int findPivot(int[] arr,int low,int hign){
        int left = low;
        int right = hign;
        int base = arr[low];
        while (left<=right){
            while (left<=right&&less(arr[left],base)){
                left++;
            }
            while (left<=right&&more(arr[right],base)){
                right--;
            }
            if (left<=right) {
                exch(arr,left,right);
            }
        }
        exch(arr,low,right);
        return right;
    }
    private static boolean less(int v, int w) {
        return v<=w;
    }

    private static boolean more(int v, int w) {
        return v>w;
    }

    private static void exch(int[] a, int i, int j) {
        Integer t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
