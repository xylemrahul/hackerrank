package hackerrank.xylemraj.mmt.hackerrank;

public class RepeatedString
{

    public static void main(String[] args)
    {
        repeatedStrings( "aabaabbccaq",100l );
    }

    static void repeatedStrings(String str, long len) {

        long count = 0;
        long l = len % str.length();
        long quotient = len/str.length();
        for( int i = 0; i < str.length(); i++ )
        {
            if(str.charAt( i ) == 'a'){
                count++;
            }
        }
        System.out.println( "Count in single string" + count );
        count = count*quotient;
        for( int i = 0; i < l; i++ )
        {
            if(str.charAt( i ) == 'a'){
                count++;
            }
        }
        System.out.println( "Total count" + count );
    }
}
