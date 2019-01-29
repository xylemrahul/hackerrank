package hackerrank.xylemraj.mmt.hackerrank;

import java.util.Arrays;

public class MinMaxSum {

    public static void main(String[] args){
        miniMaxSum(new int[]{1,2,3,4,5});
    }

    static void miniMaxSum(int[] arr) {

        long minSum = 0 , maxSum = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length -1; i++){
            minSum = minSum + arr[i];
        }
        for(int i = 1; i < arr.length; i++){
            maxSum = maxSum + arr[i];
        }

        System.out.print(minSum + " "+ maxSum);
    }
}
