package hackerrank.xylemraj.mmt.hackerrank;

public class SampleDemo{

    public static void main(String[] args){

        ThreadClass A = new ThreadClass( "A" );
        ThreadClass B = new ThreadClass( "B" );

        B.start();
        A.start();
    }
}
