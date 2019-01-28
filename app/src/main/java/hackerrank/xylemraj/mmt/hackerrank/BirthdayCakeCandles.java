package hackerrank.xylemraj.mmt.hackerrank;

import java.util.Arrays;

public class BirthdayCakeCandles {

    public static void main(String[] args){
        birthdayCakeCandles(new int[]{3,5,5,1,5});
    }

    static int birthdayCakeCandles(int[] arr) {
        int count =1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                count++;
            }
        }
        return count;
    }
}
