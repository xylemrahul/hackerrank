package demo.testdome;

import java.util.ArrayList;
import java.util.List;

public class Consecutives {

    public static void main(String[] args){

        consec(new String[]{"a","a","a","b","b","c","d","e","a","a"});
    }

    //[a,a,a,b,b,c,d,e,a,a]

    static void consec(String[] strArr){

        int count = 1, maxCount =1;

        int j =0;
        List<String> mList = new ArrayList<>();
        for (int i = 0; i <= strArr.length-2; i++) {

            if(strArr[i] == strArr[i+1]){
                count++;
            }else{
                mList.add(strArr[i].toUpperCase()+ count);
                if(count > maxCount){
                    maxCount = count;
                }
                count = 1;

                j++;
            }
            if(i == strArr.length -2){
                mList.add(strArr[i].toUpperCase()+ count);
            }
        }

        for (int i = 0; i < mList.size(); i++) {
            System.out.print(mList.get(i));
        }
        System.out.print( "\n" + maxCount);

    }
}
