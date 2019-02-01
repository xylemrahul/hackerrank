package hackerrank.xylemraj.mmt.hackerrank;

public class DrawingBook {

    public static void main(String[] args){

        pageCount(6,5);
    }

    static int pageCount(int n, int p) {

        int pageCount = 0;
        if(p <= n/2){
            if(p == 1){
                pageCount = 0;
            }else{
                pageCount = p/2;
            }
        }else{
            if(p == n ){
                pageCount = 0;
            }else if( p == n-1){
                pageCount = 1;
            } else{
                pageCount = (n-p)/2 ;
            }
        }
        return pageCount;
    }
}
