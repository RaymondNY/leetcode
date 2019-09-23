package sort;

import java.util.Arrays;

public class Quicksort {
    public static void quick(int[] arr,int start ,int last){
        if (start == last) {
            return ;
        }
        //找基准位置
        int pivotIndex = partition(arr,start,last);

        quick(arr,start,pivotIndex-1);
        quick(arr,pivotIndex+1,last);
    }
    private static int partition(int[] arr, int start, int last) {
        int left = start;
        int right = last;
        int pivot = arr[start];
        while (left!=right){
            while (left<right &&arr[right]>=pivot){
                --right;
            }
            while (left<right &&arr[left]<=pivot){
                ++left;
            }
            if (left<right) {
                int p = arr[left];
                arr[left]=arr[right];
                arr[right]=p;
            }
        }
        arr[start]=arr[left];
        arr[left]=pivot;
        return left;
    }

    public static void main(String[] args) {
        int[] a = {1,8,5,6};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
