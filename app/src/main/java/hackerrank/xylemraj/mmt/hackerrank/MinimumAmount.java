package hackerrank.xylemraj.mmt.hackerrank;

public class MinimumAmount {

    public static void main(String[] args){

        minAmt(new int[]{4,9,2,3});
    }

    static void minAmt( int[] arr ){

        int length = arr.length;
        int a = arr[0];
        int b = Math.max(arr[1] - arr[0], 0 );
        int sum = a+b;
        for (int i = 2; i < length; i++) {
            int j = 1, min = a;
            while( j < i){
                min = Math.min(arr[j],min);
                j++;
            }

            sum = sum + Math.max(arr[i] - min,0);
        }

    }
}
