package hackerrank.xylemraj.mmt.hackerrank;

import java.util.Arrays;

/**
 * Questions controversial , not clear.
 * */
public class BetweenTwoSets
{
    //TODO : Important concept of finding HCF
    public static void main(String[] args){

        int i = getTotalX( new int[]{3,4},new int[]{ 24,48 } );
        System.out.print( i );
    }

    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
        int count = 0;
        int gcd = arrayGCD( b );
        for( int i = 0; i < a.length; i++ )
        {
            if(gcd % a[i] == 0){
                if( i == a.length -1 ){
                    int lastElement = a[i];

                    while(lastElement <= b[0]){

                        if(gcd % lastElement == 0 ){
                            count++;
                        }
                        lastElement++;
                    }
                }
            }
        }
        return count;
    }

    static int gcd(int a, int b){

        if( a == 0 )
        {
            return b;
        }
        return gcd( b%a,a );
    }

    static int arrayGCD(int[] arr){
        int result = arr[0];
        for( int i = 1; i < arr.length; i++ )
        {
            result = gcd( arr[i], result );
        }
        return result;
    }
}
