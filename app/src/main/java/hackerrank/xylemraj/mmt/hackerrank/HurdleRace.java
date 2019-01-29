package hackerrank.xylemraj.mmt.hackerrank;

import java.util.Arrays;

public class HurdleRace
{

    public static void main(String[] args){

        hurdleRace( 4,new int[]{1,6,3,5,2} );
    }

    //TODO : do it without sorting
    static int hurdleRace(int k, int[] height) {

        Arrays.sort( height );
        int highest = 0;

        if(k > height[height.length - 1]){
            highest = k;
        }else{
            highest = height[height.length - 1];
        }
        return highest-k;
    }
}
