package hackerrank.xylemraj.mmt.hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static java.util.Map.Entry.comparingByValue;

public class BallotSystem {

    public static void main(String[] args){

        String[] votes = { "john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john" };
        ballot(votes);
    }

    static String ballot(String[] voters){
        Map<String, Integer> map = new HashMap<>();

        for (String vote: voters){

            if(map.containsKey(vote)){
                map.put(vote, map.get(vote) + 1);
            }else{
                map.put(vote, 1);
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        int max = 0;
        String winner = null;
        for (Map.Entry<String, Integer> entry : entries){

            String key = entry.getKey();
            int value = entry.getValue();

            if (value > max){
                max = value;
               winner = key;
            }else if(value == max && winner.compareTo(key) < 0 ){
                winner = key;
            }
        }

        return winner;
    }
}
