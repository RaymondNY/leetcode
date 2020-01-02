package algorithms.cp2_1;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {12,456,84,56,445,45841,1255,6589,1123,166,1654};
//        mergeSort(arr,0,arr.length);
//        System.out.println(Arrays.toString(arr));
        st(arr);
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
        int[] tem = new int[high-low];
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
        for (int k = 0; k < tem.length; k++) {
            arr[low + k] = tem[k];
        }

    }
    public static void st(int[] data){
        int n = data.length;
        //步长
        int s = 1;
        int low,mid,hign;
        while(s<n){
            System.out.println("长度"+s);
            low=0;
            while(low<n){
                mid=low+s;
                hign=Math.min(low+2*s,n);
                if (mid < hign) {
                    merge(data,low,mid,hign);
                    System.out.println(low+"--"+mid+"--"+hign);
                }
                low+=2*s;
            }
            //处理末尾残余部分
            s*=2;
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
