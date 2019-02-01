package hackerrank.xylemraj.mmt.hackerrank;

public class CatAndMouse {

    public static void main(String[] args){


    }

    static String catAndMouse(int x, int y, int z) {

        String result = null;
        if( Math.abs(x - z) ==  Math.abs(y - z)){
            result = "Mouse C";
        }else if(Math.abs(x - z)<Math.abs(y - z)){
            result = "Cat A";
        }else{
            result = "Cat B";
        }
        return result;
    }
}
