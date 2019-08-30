package BasicSort;

public class BubbleSort {
    private static int[] arr= {12,7,18,9,5,22};
    //
    private static int[] sort(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            for(int j=0;j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    //
                    arr[j] = arr[j+1];
                    //
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
