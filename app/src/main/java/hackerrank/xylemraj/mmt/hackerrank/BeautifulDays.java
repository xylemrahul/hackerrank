package hackerrank.xylemraj.mmt.hackerrank;

public class BeautifulDays {

    public static void main(String args[]){

        beautifulDays(13, 45, 3);
    }

    static int beautifulDays(int i, int j, int k) {

        int count =0;
        for (int l = i; l <=j ; l++) {
            if( Math.abs(l - reverseNo(l)) % k == 0){
                count++;
            }
        }
        return count;
    }

    private static int reverseNo(int no){

        int result = 0;
        while(no != 0) {
            result = result * 10;
            result = result + no % 10;
            no = no / 10;
        }
        return result;
    }
}
