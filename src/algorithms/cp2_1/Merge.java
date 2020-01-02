package algorithms.cp2_1;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {5,7,22,45,64,4,9,21,35};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int low ,int high){
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid+1, high);
        }
    }
    public static void merge(int[] arr,int low ,int mid ,int high){
        int left =low;
        int right = mid;
        int[] tem = new int[high-low+1];
        int temIndex=0;
        while (left < mid && right < high){
            if (less(arr[left],arr[right])) {
                tem[temIndex++] = arr[left++];
            }else {
                tem[temIndex++] = arr[right++];
            }
        }
        while (left<mid) tem[temIndex++] = arr[left++];
        while (right<high) tem[temIndex++] = arr[right++];

        for (int k = 0; k < temIndex; k++) {
            arr[low + k] = tem[k];
        }
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
