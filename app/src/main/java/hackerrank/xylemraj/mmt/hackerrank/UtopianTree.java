package hackerrank.xylemraj.mmt.hackerrank;

public class UtopianTree {

    //TODO : unable to understand, issue with question
    public static void main(String[] args){

    }

    static int utopianTree(int n) {
        int height = 1;
        for (int i = 1; i < n; i++) {
           if(i%2 == 1){
               height *=2;
           }else{
               height +=1;
           }
        }
        return height;
    }
}
