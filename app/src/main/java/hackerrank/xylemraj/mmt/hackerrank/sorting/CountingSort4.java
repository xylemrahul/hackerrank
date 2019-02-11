package hackerrank.xylemraj.mmt.hackerrank.sorting;

import java.util.Scanner;

public class CountingSort4
{
    public static void main( String[] args ){

        Scanner scan=new Scanner( System.in);
        int size=Integer.parseInt(scan.nextLine());
        StringBuffer[] buffer = new StringBuffer[100];

        for( int i = 0; i < 100; i++ )
        {
            buffer[i] = new StringBuffer();
        }

        for( int i = 0; i < size; i++ )
        {
            String string = scan.nextLine();
            String[] str = string.split("[\\s]+");
            Integer k = Integer.valueOf( str[ 0 ] );
            String s;
            if(i<size/2){
                s = "- ";
            }else {
                s=str[1] + " ";
            }
            buffer[k] = buffer[k].append( s );
        }

    }
}
