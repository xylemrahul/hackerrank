package hackerrank.xylemraj.mmt.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static void main(String[] args){
        try {
            timeConversion("10:30:45PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static void timeConversion(String time) throws ParseException {

        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = parseFormat.parse(time);

        System.out.print(displayFormat.format(date));
    }
}
