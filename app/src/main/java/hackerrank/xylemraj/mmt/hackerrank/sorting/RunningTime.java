package hackerrank.xylemraj.mmt.hackerrank.sorting;

public class RunningTime
{
    public static void main(String[] args){

        runningTime( new int[]{4,4,3,4} );
    }

    static int runningTime(int[] arr) {
            int count =0;
            int temp = 0;
            for( int i = 0; i < arr.length; i++ )
            {
                for( int j = i+1; j < arr.length; j++ )
                {
                    if( arr[j] < arr[i] ){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        count++;
                    }
                }
            }
            return count;
    }
}
