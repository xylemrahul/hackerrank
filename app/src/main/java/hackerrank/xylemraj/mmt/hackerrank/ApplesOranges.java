package hackerrank.xylemraj.mmt.hackerrank;

public class ApplesOranges {

    public static void main(String[] args){

        countApplesAndOranges(7 ,11,5, 15, new int[]{-2,2,1}, new int[]{5,-6} );
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int noOfApples = 0, noOfOranges = 0;
        for (int i = 0; i < apples.length; i++) {

            int inside = a + apples[i];
            if( inside >= s && inside <= t ){
                noOfApples++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {

            int inside = b + oranges[i];
            if( inside >= s && inside <= t ){
                noOfOranges++;
            }
        }

        System.out.println(noOfApples + "\n" + noOfOranges);
    }
}
