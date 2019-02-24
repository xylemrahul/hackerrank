package hackerrank.xylemraj.mmt.hackerrank;

import java.util.List;

public class BinaryJumps {

    public static void main(String[] args){

    }

    static void binaryJumps(String s){

        int last = s.charAt(s.length() - 1);
        int count =1;
        int power = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == last){
                if(count > power){
                    power = count;
                    count =1;
                }
            }else{
                count++;
            }
        }

    }
}
