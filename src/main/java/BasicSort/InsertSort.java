package BasicSort;

public class InsertSort {
    private static int[] arr = {21,19,17,15,13,11,9};
    //
    private static int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int tmp = arr[i];
            //
            int j = i-1;
            while(j >=0 && arr[j] >tmp){
                arr[j+1] = arr[j];
                j --;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
    //
    public static void main(String[] args) {
        sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
