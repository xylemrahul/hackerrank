package hackerrank.xylemraj.mmt.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    public static void main(String[] args){
//        compareTriplets();
    }

    static void compareTriplets(List<Integer> a, List<Integer> b) {
        int Alice = 0,Bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)){
                Alice++;
            }
            if(a.get(i)<b.get(i))
            {
                Bob++;
            }
        }
        List<Integer> mList = new ArrayList<>();
        mList.add(Alice);
        mList.add(Bob);
    }
}
