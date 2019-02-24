package hackerrank.xylemraj.mmt.hackerrank;

public class MinimumSwaps {

    public static  void main(String[] args){

        minimumSwaps(new int[]{7,1,3,2,4,5,6});
    }

    static void swap(int[] array,int left, int right){
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    static int minimumSwaps(int[] arr) {
        int rightPointer = arr.length -1;

        int count = 0;
        int minimumSwaps = 0;

        while(count < arr.length){
            int arrValue = count+1;

            if(arr[count] == arrValue){
                count++;
                continue;
            }

            while(arr[rightPointer] != arrValue){
                rightPointer --;
            }

            if(rightPointer != count){
                swap(arr, count, rightPointer);
                minimumSwaps++;
            }

            rightPointer = arr.length -1;
            count++;
        }
        return minimumSwaps;
    }
}
