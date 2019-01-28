package hackerrank.xylemraj.mmt.hackerrank;

public class DiagonalDifference {

    public static void main(String[] args){
        diffMatrix(new int[][]{ { 11, 2, 4 },
                { 4, 5, 6 },
                { 10, 8, -12 } });
    }

    static void diffMatrix(int[][] mat){
        int sum = 0, secondarySum = 0;
        for ( int i = 0; i < mat.length ; i++ ) {
            for( int j = 0; j < mat[i].length ; j++ ) {
                if( j == i ){
                    sum = sum + mat[i][j];
                }
            }
        }
        int[][] revMat = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            int k =0 ;
            for (int j = mat[i].length - 1; j >= 0 ; j--) {
                revMat[i][k] = mat[i][j];
                k++;
            }
        }

        for ( int i = 0; i < revMat.length ; i++ ) {
            for( int j = 0; j < revMat[i].length ; j++ ) {
                if( j == i ){
                        secondarySum = secondarySum + revMat[i][j];
                }
            }
        }
        System.out.println(Math.abs(sum-secondarySum));
    }
}
