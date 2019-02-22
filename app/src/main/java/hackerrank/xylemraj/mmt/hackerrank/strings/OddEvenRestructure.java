package hackerrank.xylemraj.mmt.hackerrank.strings;

public class OddEvenRestructure
{
    public static void main(String[] args){

            oddeven( new int[]{ 3, 5, 2, 19, 16, 18, 25, 32, 76, 81, 4, 6} );
    }

    //{3, 5, 2, 19, 16, 18, 25, 32, 76, 81, 4, 6}
    static void oddeven(int[] arr){

        int first = arr[0];
        int last = arr[arr.length - 1];
        int i =0, j= arr.length -1;
        while(i < j)
        {
            //increment i till you find an odd number
            while(arr[i]%2 == 0 && i < j){
                i++;
            }

            //decrement j till you find an even number
            while(arr[j]%2 != 0 && j > i){
                j--;
            }

            //interchange items at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
