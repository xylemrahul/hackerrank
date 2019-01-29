package hackerrank.xylemraj.mmt.hackerrank;

public class JumpingClouds {

    public static void main(String[] args)
    {
        minSteps(new int[]{0,0,1,0,0,1,0});
    }

    static void minSteps(int[] a){

        int hops = 0;
        for (int i = 0; i < a.length-2; i++) {
            if(a[i+2] == 0){
                i++;
                hops++;
                continue;
            }
            hops++;
            if(i == a.length - 2){
                hops++;
            }
        }
    }
}
