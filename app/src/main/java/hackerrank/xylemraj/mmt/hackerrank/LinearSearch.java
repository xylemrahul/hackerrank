package hackerrank.xylemraj.mmt.hackerrank;

import java.util.List;

public class LinearSearch {

    public static void main(String[] args){

    }

    static String findNumber(List<Integer> arr, int k) {
        String result = "NO";
        int front = 0, back = arr.size()-1;

        for (int i = 0; i < arr.size(); i++) {

            while(front <= back){
                if(k == arr.get(front) || k == arr.get(back) ){
                    result = "YES";
                }
                front++; back--;
            }
        }
        return result;
    }
}
