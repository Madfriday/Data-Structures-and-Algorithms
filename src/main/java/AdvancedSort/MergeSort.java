package AdvancedSort;

public class MergeSort {
    private static void mergesort(int[] arr,int left, int right){
        if(left >= right) return;
        int center = (left + right) / 2;
        mergesort(arr,left,center);
        mergesort(arr,center+1,right);
        merge(arr,left,center,right);
    }

    private static void merge(int[] arr, int left, int center, int right) {
        int[] tmp = new int[arr.length];
        //
        int f1 = left;
        int r1 = center + 1;
        int tm = left;
        while(left <= center && r1 <= right){
            if(arr[left] <= arr[r1]){
                tmp[f1++] = arr[left++];
            }else {
                tmp[f1++] = arr[r1++];
            }
        }
        while(left <= center){
            tmp[f1++] = arr[left++];
        }
        while(r1 <= right){
            tmp[f1++] = arr[r1++];
        }
        while(tm <= right){
            arr[tm] = tmp[tm++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,3,6,2,1,9,4,8,7};
        mergesort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
