package hackerrank.xylemraj.mmt.hackerrank;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValley(int n, String s) {

        char[] chars = s.toCharArray();

        int u = 0 , d = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'U' ){
                u++;
                if(d>0)
                {
                    d--;
                }
            }else if(chars[i] == 'D' ){
                if(u>0)
                {
                    u--;
                }
                d++;
            }
        }
        return d;
    }

    public static void main(String[] args){
        int result = countingValley(12, "DDUUDDUDUUUD");
        System.out.println("Result is" + result);
    }
}
