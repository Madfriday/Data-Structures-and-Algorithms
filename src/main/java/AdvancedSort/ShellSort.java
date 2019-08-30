package AdvancedSort;

public class ShellSort {
    private static int[] arr = {9,7,5,3,1};
    //
    private static void sort(int[]  arr){

        for(int step = arr.length /2;step>=1; step /=2){
            for(int i = step;i<arr.length;i++){
                int j = i - step;
                int tmp = arr[i];
                while (j >=0 && tmp < arr[j]){
                    arr[j+step] = arr[j];
                   j -= step;
                }
                arr[j+step] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        sort(arr);
        for(int i :arr){
            System.out.println(i);
        }
    }
}
