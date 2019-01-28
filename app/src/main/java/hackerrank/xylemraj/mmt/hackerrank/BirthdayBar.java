package hackerrank.xylemraj.mmt.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayBar
{
    public static void main(String[] args){

        List<Integer> mList = new ArrayList<>();
        mList.add( 4);


        birthdayChocolate( mList,4,1 );
    }

    static void birthdayChocolate( List<Integer> list, int sum, int noOfSquares){
        int length = list.size();
        int count = 0;

        for( int i = 0; i <= length - noOfSquares; i++ )
        {
            int j = i,k=0;
            int s = 0;
            do{
               s = s+list.get( j );
               j++;
               k++;
            }while( k< noOfSquares );

            if(s == sum){
                count++;
            }
        }
    }
}
