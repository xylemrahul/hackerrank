package hackerrank.xylemraj.mmt.hackerrank.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort1
{
    public static void main(String[] args){


    }

    static int[] quickSort(int[] arr) {

        int pivot = arr[0];
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        for( int i = 1; i < arr.length; i++ )
        {
            if(arr[i] < pivot){
                leftList.add( arr[i] );
            }else{
                rightList.add( arr[i] );
            }
        }

        int[] finalArr = new int[ arr.length];
        Collections.addAll( leftList );
        finalArr[leftList.size()] = pivot;
        Collections.addAll( rightList );
        return finalArr;
    }
}
