package AdvancedSort;

public class CountingSort {
    private static int[] arr  = {11,6,7,5,4,3,3,1,2};
    //
    private static int[] sort(int[] arr,int maxszie){
        int[] c = new int[maxszie+1];
        int[] b = new int[arr.length];
        //
        for(int i=0;i<arr.length;i++){
            c[arr[i]] ++;
        }

        for(int i=1;i<c.length;i++){
            c[i]+= c[i-1];
        }

        for(int i = arr.length-1;i >=0;i--){
           b[c[arr[i]] -1] = arr[i];
            c[arr[i]]--;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] b = sort(arr,11);
        for(int i : b){
            System.out.println(i);
        }
    }
}
