package hackerrank.xylemraj.mmt.hackerrank;

import java.text.DecimalFormat;

public class PlusMinusArray {

    public static void main(String[] args){

        plusMinus(new int[]{-4 ,3 ,-9, 0, 4, 1});
    }

    static void plusMinus(int[] arr) {

        int pos =0,neg =0, zero =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 ){
                pos++;
            }else if(arr[i] < 0){
                neg++;
            }else{
                zero++;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.######");
        System.out.println(decimalFormat.format((double) pos/arr.length));
        System.out.println(decimalFormat.format((double) neg/arr.length));
        System.out.println(decimalFormat.format((double) zero/arr.length));    }
}
