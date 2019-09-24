package sort;

import java.util.Arrays;

public class Heapsort {
    public static void downAdjust(int[] arr,int parentIndex,int length){
        int tem = arr[parentIndex];
        int children = 2*parentIndex+1;
        while (children<length){
            if (children+1<length && arr[children+1]>arr[children]) {
                children++;
            }
            if (tem>arr[children]){
                break;
            }
            arr[parentIndex]=arr[children];
            parentIndex=children;
            children=children*2+1;
        }
        arr[parentIndex]=tem;

    }
    //升序，最大堆
    public static void sort(int[] arr){
        for (int i = (arr.length-2)/2; i >=0; i--) {
            downAdjust(arr,i,arr.length);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downAdjust(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,5,3,6,4,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
