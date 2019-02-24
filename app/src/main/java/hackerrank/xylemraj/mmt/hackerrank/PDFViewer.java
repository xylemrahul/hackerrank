package hackerrank.xylemraj.mmt.hackerrank;

import java.util.Arrays;

public class PDFViewer
{

    public static void main(String args[]){

        designerPdfViewer( new int[]{
                1 ,3 ,1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5 ,5, 5, 5 ,5, 5, 5 ,5 ,5, 5, 5, 7
        },"zaba" );
    }

    static int designerPdfViewer(int[] h, String word) {

        int length = word.length();
        int highest = 0;
        for( int i = 0; i < length; i++ )
        {
            int value = word.charAt( i ) - 'a';
            if(highest < h[value]){
                highest = h[value];
            }
        }

        return word.length() * highest;
    }
}
