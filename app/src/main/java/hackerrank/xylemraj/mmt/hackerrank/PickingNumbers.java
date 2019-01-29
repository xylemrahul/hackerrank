package hackerrank.xylemraj.mmt.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers
{

    public static void main(String[] args){
        List<Integer> mList = new ArrayList<>();
        mList.add(4);
        mList.add(6);
        mList.add(5);
        mList.add(3);
        mList.add(3);
        mList.add(1);
        pickingNos(mList);
    }

    public static void pickingNos(List<Integer> mList) {
        int i = 0, result = 0;
        do{
            int count = 0;
            for (int j = i; j < mList.size(); j++) {
                if( Math.abs(mList.get(i) - mList.get(j) ) <= 1){
                    count++;
                }
            }
            if(result<count)
            {
                result = count;
            }
            i++;
        }while( i <mList.size() );
        System.out.print(result);
    }
}
