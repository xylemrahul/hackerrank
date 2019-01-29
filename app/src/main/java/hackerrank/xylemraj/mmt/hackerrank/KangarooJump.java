package hackerrank.xylemraj.mmt.hackerrank;

public class KangarooJump {

    public static void main(String[] args){

        kangaroo(14,4,98,2);
    }

    //x1>x2
    static void kangaroo(int x1, int v1, int x2, int v2) {

      if(v1 <= v2){
          System.out.println("NO");
      }else{
          if((x2-x1)%(v1-v2) != 0){
              System.out.println("NO");
          }else {
              long diff = (x2 - x1) / (v1 - v2);
              if (((v1 * diff) + x1) == ((v2 * diff) + x2)) {
                  System.out.println("YES");
              }
          }
      }
    }
}
