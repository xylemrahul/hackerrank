package hackerrank.xylemraj.mmt.hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant
{

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int pairs = 0;
        HashMap<Integer,Integer> pairMap = new HashMap<>();
        for( int sock : ar ){
            if(pairMap.get( sock ) == null){
                pairMap.put( sock,1 );
            }
            else{
                pairMap.put( sock, pairMap.get( sock ) +1 );
            }
        }

        Set< Map.Entry< Integer, Integer > > entries = pairMap.entrySet();

        for( Map.Entry<Integer,Integer> entry : entries){
            if(entry.getValue() >= 2){
                pairs = pairs + entry.getValue()/2;
            }
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner( System.in);

    public static void main(String[] args) throws IOException
    {

        int result = sockMerchant(9, new int[]{ 1,22,6,5,88,6,1,22,88,30,6,77,99,88,
                10, 20, 20 ,10 ,10, 30 ,50 ,10, 20});


    }
}
