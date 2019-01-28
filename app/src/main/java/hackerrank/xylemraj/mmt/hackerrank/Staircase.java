package hackerrank.xylemraj.mmt.hackerrank;

public class Staircase {

    public  static void main(String[] args){

        staircase(8);
    }

    static void staircase(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j <n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
