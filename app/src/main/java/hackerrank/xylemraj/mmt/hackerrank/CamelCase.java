package hackerrank.xylemraj.mmt.hackerrank;

public class CamelCase {

    public static void main(String[] args){

    }

    static int camelcase(String s) {
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) >= 65 && s.charAt(i)<=90 ){
                count++;
            }
        }
        return count;
    }
}
