package hackerrank.xylemraj.mmt.hackerrank.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CustomSort {

    public static void main(String[] args){
        List<Integer> mList = new ArrayList<>();

        mList.add(1);
        mList.add(4);
        mList.add(4);
        mList.add(4);
        mList.add(5);
        mList.add(3);

        customSort(mList);
    }

    static void customSort(List<Integer> list){

        Map<Integer, Integer> map = new TreeMap<>();
        list.remove(0);
        for(int type : list){
            if(map.get(type) == null){
                map.put(type,1);
            }else {
                map.put(type,map.get(type) +1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        int j = 0;
        while( j+1 <= map.size()) {
        for (Map.Entry<Integer,Integer> entry : entries) {
                if (entry.getValue() == j) {
                    System.out.print(entry.getKey());
                }
            }
            j++;
        }
    }
}
