package hackerrank.xylemraj.mmt.hackerrank

import android.os.Build
import android.support.annotation.RequiresApi

import java.time.LocalDate
import java.time.format.DateTimeFormatter

object DayofProgrammer {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @JvmStatic
    fun main(args: Array<String>) {

        dayOfProgrammer(1700)
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    internal fun dayOfProgrammer(year: Int): String {

        if (year != 1918) {
            val localDate = LocalDate.ofYearDay(year, 256)
            return localDate.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"))
        } else {

        }
        return ""
    }
}
