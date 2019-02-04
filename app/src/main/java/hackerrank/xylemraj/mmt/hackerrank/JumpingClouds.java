package hackerrank.xylemraj.mmt.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class JumpingClouds
{

    // Complete the jumpingOnClouds function below.
    // 0 0 0 0 1 0
    static int jumpingOnClouds( int[] c )
    {
        int count = 0;
        int length = c.length;
//        int i =0;
//        while(i<length){
//
//            if(c[i+1] == 1){
//                count++;
//                i +=2;
//
//            }
//        }
        for( int i = 0; i < length - 1; i++, count++ )
        {
            if( i < length - 2 && c[i+2] == 0 )
            {
                i++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) throws IOException
    {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        int[] c = new int[ n ];

        String[] cItems = scanner.nextLine().split( " " );
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        for( int i = 0; i < n; i++ )
        {
            int cItem = Integer.parseInt( cItems[ i ] );
            c[ i ] = cItem;
        }

        int result = jumpingOnClouds( c );

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
