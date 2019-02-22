package hackerrank.xylemraj.mmt.hackerrank;

public class MinimumSwaps
{

    public static void main(String[] args){

//        minimumSwaps( new int[]{
//                2, 31, 1 ,38, 29, 5, 44, 6 ,12, 18 ,39 ,9, 48 ,49 ,13, 11, 7, 27, 14 ,33 ,50 ,21, 46 ,23, 15 ,26, 8,
//                47, 40, 3 ,32, 22 ,34, 42 ,16, 41, 24, 10, 4 ,28, 36, 30 ,37, 35, 20, 17, 45 ,43, 25, 19
//        } );

        minimumSwaps( new int[]{4, 3, 1, 2} );
    }

    //4 3 1 2
    static int minimumSwaps(int[] arr) {

        int[] duplicateArr = new int[50];

        int count = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
           int num = arr[i];
            if( i+1 != arr[i] ){
                arr[i] = arr[num -1];
                arr[num -1] = num;
                count++;
            }
        }
        if(count > 0)
        {
            return count -1;
        }
        return count;
    }
}
