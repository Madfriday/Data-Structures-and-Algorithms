package BasicSort;

public class BucketSortV2 {
    private static int[] arr = {6,2,4,1,5,19,4,0};
    //
    private static void sort(int[] arr){
        int[] bucketarr = new int[20];
        //
        for(int i=0;i< arr.length;i++){
            bucketarr[arr[i]] ++;
        }
       printsort(bucketarr);
    }
//
    private static void printsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            for(int j=0;j<val;j++){
                System.out.println(i+"\t");
            }
        }
    }

    public static void main(String[] args) {
        sort(arr);
    }
}
