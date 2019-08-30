package AdvancedSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {28,55,46,38,18,89,30,-8,-10,100};
        //
        sort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }
    private static void sort(int[] arr,int first,int last){
        if(first > last) return;
        //
        int pivot = arr[first];
        //
        int low = first+1;
        //
        int high = last;
        //
        while(low <= high){
            while (low <= last && pivot >= arr[low]){
                low++;
            }
            //
            while (first <= high && pivot < arr[high]){
                high--;
            }
            if(low < high){
                int tmp = arr[low];
                arr[low] = arr[high];
                arr[high] = tmp;
            }
        }
        //
        if(first < high){
            int tmp = arr[first];
            arr[first] = arr[high];
            arr[high] = tmp;
        }
        sort(arr,first,high-1);
        sort(arr,high+1,last);

    }
}
