package hackerrank.xylemraj.mmt.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestPattern {

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        boolean matches = Pattern.matches("xxx.xxx.xxx.xxx", scanner.next());

        String ipAddress = scanner.next();

        if(matches){
            for (int i = 0; i < 3; i++) {
                int firstIndex = ipAddress.indexOf('.');
                String s = ipAddress.substring(0, firstIndex);
                if( Integer.valueOf(s) <= 255 && Integer.valueOf(s) >=0 ){

                }
            }

        }
    }
}
