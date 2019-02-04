package hackerrank.xylemraj.mmt.hackerrank.sorting;

import java.util.Arrays;

public class InsertionSort2
{

    public static void main(String[] args){

        insertionSort2( 4, new int[]{4,4,3,4} );
    }

    static void insertionSort2(int n, int[] arr) {

        int temp = 0;
        for( int i = 1; i < n; i++ )
        {
            for( int j = 0; j <= i; j++ )
            {
                if( arr[j] > arr[i] ){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            String s = Arrays.toString( arr );
            System.out.println(s.substring( 1,s.length() -1 ).replaceAll( ",","" ) );
        }
    }
}
