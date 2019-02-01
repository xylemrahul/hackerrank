package hackerrank.xylemraj.mmt.hackerrank;

public class CountingValleys
{

    // Complete the countingValleys function below.
    static int countingValley( int n, String s )
    {

        char[] chars = s.toCharArray();
        int valley = 0;
        int level = 0;
        for( int i = 0; i < chars.length; i++ )
        {
            if( chars[ i ] == 'U' )
            {
                level++;
            }
            else if( chars[ i ] == 'D' )
            {
                if( level == 0 )
                {
                    valley++;
                }
                level--;
            }
        }
        return valley;
    }

    public static void main( String[] args )
    {
        int result = countingValley( 12, "DDUUDDUDUUUD" );
        System.out.println( "Result is" + result );
    }
}
