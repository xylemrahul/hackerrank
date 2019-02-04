package hackerrank.xylemraj.mmt.hackerrank.strings;

import java.util.Arrays;

public class MakeAnagram {

    public static void main(String[] args){

        makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
    }

    static int makeAnagram(String a, String b) {

        int result =0;
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        int count1[] = new int[256];
        Arrays.fill(count1,0);
        int count2[] = new int[256];
        Arrays.fill(count2,0);

        for (int i = 0; i < a.length(); i++) {
            count1[str1[i]]++;
        }
        for (int i = 0; i < b.length(); i++) {
            count2[str2[i]]++;
        }

        for (int i = 0; i < 256; i++) {
            if(count1[i]>count2[i]){
                result = result + (count1[i] - count2[i]);
            }else{

                result = result = result + (count2[i] - count1[i]);;
            }
        }
        return result;
    }
}
