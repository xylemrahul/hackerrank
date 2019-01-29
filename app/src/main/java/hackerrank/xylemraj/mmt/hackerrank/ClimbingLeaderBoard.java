package hackerrank.xylemraj.mmt.hackerrank;

import java.util.TreeSet;

public class ClimbingLeaderBoard {

    public static void main(String[] args){
        climbingLeaderboard(new int[]{100,100,50,40,40,20,10}, new int[]{5,25,50,120});
    }

    static void climbingLeaderboard(int[] scores, int[] alice){

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < scores.length; i++) {
            treeSet.add(scores[i]);
        }

        int[] result = new int[alice.length];
        TreeSet<Integer> aliceSet = (TreeSet<Integer>) treeSet.clone();
        for (int i = 0; i < alice.length; i++) {
               aliceSet.add(alice[i]);
               result[i] = Math.abs(aliceSet.headSet(alice[i]).size() - aliceSet.size());
               aliceSet.remove(alice[i]);
        }
    }
}
