package hackerrank.xylemraj.mmt.hackerrank;

public class AppendDelete
{
    public static void main(String[] args){

        appendAndDelete( "abcd",
                         "abcdert",
                         10 );
    }

    static String appendAndDelete(String originalStr, String resultStr, int number) {

        int length = originalStr.length();
        int length1 = resultStr.length();
        int count = 0;
        String result = null;
        if(originalStr.equals( resultStr ) && number > 1){

            result = "Yes";
        }

        for( int i = 0; i < length && i<length1 ; i++ )
        {
            if(length == length1)
            {
                if(originalStr.charAt( i ) == resultStr.charAt( i )){
                    count++;
                }else {
                    count += (length - ((i +1)) + (length1 - (i +1)));
                    break;
                }
            }else{

                if(originalStr.charAt( i ) == resultStr.charAt( i )){
                    count = Math.abs( length - length1 );
                }else{
                    count += (length - ((i +1)) + (length1 - (i +1)));
                    break;
                }
            }
        }
        if(number > count){
            result = "Yes";
        }else{
            result = "No";
        }
        return result;
    }
}
