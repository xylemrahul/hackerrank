package hackerrank.xylemraj.mmt.hackerrank.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LilyHomework
{

//    public static void main(String[] args){
//
//        lilysHomework( new int[]{3,4,2,5,1} );
//    }
//
//    static int lilysHomework(int[] arr) {
//
//        int count = 0;
//        List<Integer> originalList = new ArrayList<>();
//        for (int i : arr) {
//            originalList.add(i);
//        }
//        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//        List<Integer> duplicateList = new ArrayList<>();
//        List<Integer> sortedList = new ArrayList<>();
//        duplicateList.addAll( originalList );
//        sortedList.addAll( originalList );
//        Collections.sort( sortedList );
////        quickSort(sortedList);
//
//        for( int i = 0; i < originalList.size(); i++ )
//        {
//            int pos = 0;
//            if(duplicateList.get( i ) != sortedList.get( i )){
//                pos = duplicateList.indexOf( sortedList.get( i ) );
//                duplicateList.remove( pos );
//                duplicateList.add( pos, duplicateList.get( i ) );
//                duplicateList.remove( i );
//                duplicateList.add( i, sortedList.get( i ) );
//                count++;
//            }
//        }
//
//        int count1 =0;
//        Collections.sort( sortedList, Collections.reverseOrder() );
//        for( int i = 0; i < originalList.size(); i++ )
//        {
//            int pos = 0;
//            if(duplicateList.get( i ) != sortedList.get( i )){
//                pos = duplicateList.indexOf( sortedList.get( i ) );
//                duplicateList.remove( pos );
//                duplicateList.add( pos, duplicateList.get( i ) );
//                duplicateList.remove( i );
//                duplicateList.add( i, sortedList.get( i ) );
//                count1++;
//            }
//        }
//
//        return count > count1 ? count1 : count;
//    }


    private static final Scanner scn = new Scanner( System.in);

    private static void swap(long[] array, int index1, int index2) {
        long temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int swaps(long[] unsortedValues) {
        int swaps = 0;

        Map<Long, Integer> locations = new HashMap<>();
        for (int i = 0; i < unsortedValues.length; i++) {
            locations.put(unsortedValues[i], i);
        }

        long [] sortedValue = unsortedValues.clone();
        Arrays.sort(sortedValue);

        for (int i = 0; i < sortedValue.length; i++) {
            if (sortedValue[i] != unsortedValues[i]) {
                swaps++;

                int swapIndex = locations.get(sortedValue[i]);
                locations.put(unsortedValues[i], swapIndex);

                swap(unsortedValues, i, swapIndex);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {

        int numberOfElements = scn.nextInt();
        long[] values = new long[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            int value = scn.nextInt();
            values[i] = value;
        }
        // When all you have is a hammer, everything begins to look like a nail.
        long [] reverseValue = IntStream.rangeClosed( 1, values.length).mapToLong(
                i -> values[values.length - i]).toArray();
        System.out.println(Math.min(swaps(values), swaps(reverseValue)));

    }

}

