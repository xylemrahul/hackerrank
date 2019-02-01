package hackerrank.xylemraj.mmt.hackerrank.strings;

public class SuperReducedString {

    public static void main(String args[]){

        superReducedString("aa");
    }

    static String superReducedString(String s) {

        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while(i < sb.length() - 1){
            if(sb.charAt(i) == sb.charAt(i+1)){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i=0;
            }else{
                i++;
            }
        }
        if(sb.length() == 0){
            return "Empty String";
        }
        return sb.toString();
    }
}
