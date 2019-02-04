package hackerrank.xylemraj.mmt.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Questions controversial , not clear.
 * */
public class BetweenTwoSets
{

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

    private static final Scanner scan = new Scanner( System.in);

    public static void main(String[] args) throws IOException
    {

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);
    }
}
