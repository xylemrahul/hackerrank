package hackerrank.xylemraj.mmt.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MigratoryBirds {
    public static void main(String[] args){

        List<Integer> mList = new ArrayList<>();

        mList.add(1);
        mList.add(4);
        mList.add(4);
        mList.add(4);
        mList.add(5);
        mList.add(3);

        migratoryBirds(mList);
    }

    static void migratoryBirds(List<Integer> list) {

        int result =0;
        Map<Integer, Integer> map = new TreeMap<>();

        for(int type : list){
            if(map.get(type) == null){
                map.put(type,1);
            }else {
                map.put(type,map.get(type) +1);
            }
        }

        int highest = 0,key =0;
        int[] arr = new int[6];
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer,Integer> entry : entries) {

            highest = entry.getValue();
            key = entry.getKey();
            arr[key] = highest;
        }

        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i+1] >= arr[i] ){
                if(arr[i+1] == arr[i]){
                    result = i;
                }else{
                    result = i+1;
                }
            }
        }

    }
}
