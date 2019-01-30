package hackerrank.xylemraj.mmt.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BonApetite {

    public static void main(String[] args){
        List<Integer> mList = new ArrayList<>();

        mList.add(3);
        mList.add(10);
        mList.add(2);
        mList.add(9);

        bonAppetit(mList, 1, 12);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {

            sum += bill.get(i);
        }

        sum -= bill.get(k);

        if(sum/2 == b){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(Math.abs(sum/2 -b));
        }
    }
}
