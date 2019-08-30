package BasicSort;

public class SelectSort {
    private static int[] arr = {19,17,15,13,12,7,9};
    //
    private static int[] sort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            int index = i;
            for(int j =i+1;j<= arr.length-1;j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
                //
                int tmp = arr[index];
                arr[index] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }
    //
    public static void main(String[] args) {
        sort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
