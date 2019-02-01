package hackerrank.xylemraj.mmt.hackerrank.strings;

import java.util.Arrays;

public class GameOfThrones {

    public static void main(String[] args){

        gameOfThrones("aaabbbb");
    }

    static String gameOfThrones(String s) {

        int count[] = new int[256];
        Arrays.fill(count, 0);
        for (int i = 0; i < s.length(); i++) {
            count[(int)s.charAt(i)]++;
        }
        
        int odd =0, even = 0;
        for (int i = 0; i < 256 ; i++) {
            if(count[i] == 1){
                odd++;
            }
            if(count[i] > 2){
                even++;
            }
        }

        if(odd == 1 ){
            return "YES";
        }
        if(s.length() %2 ==1 && even >=1){
            return "YES";
        }
        return "NO";
    }
}
