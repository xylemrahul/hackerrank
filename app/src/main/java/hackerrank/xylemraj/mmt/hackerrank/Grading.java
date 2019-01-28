package hackerrank.xylemraj.mmt.hackerrank;

public class Grading
{
    public static void main(String args[]){

        roundGrades( new int[]{73,67,38,33} );
    }

    static void roundGrades( int[] grades ){

        for( int i = 0; i < grades.length; i++ )
        {
            if(grades[i]>=38)
            {
                int quotient = grades[ i ] / 5;
                if( ( 5 * ( quotient + 1 ) ) - grades[ i ] < 3 )
                {
                    grades[i] = (quotient + 1)*5;
                }
            }
        }
    }
}
