package subtask1

import java.util.Calendar
import java.util.GregorianCalendar

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val d: Int = day.toInt()
        val m: Int = month.toInt()
        val y: Int = year.toInt()
        var f: Int
        var date: String = "Такого дня не существует"
        if ((y % 400 === 0) || ((y % 4 === 0) && (y % 100 !== 0)))
            { f = 1 }
            else { f = 0 }
        if ((m <= 12) && (d < 32)) {
            when (month) {
                "1" -> date = "$day января"
                "2" -> if (( d < 30 ) && (f == 1)){date = "$day февраля"}
                           else if (( d < 29 ) && (f == 0)){date = "$day февраля"}
                "3" -> date = "$day марта"
                "4" -> if ( d < 31 ) { date = "$day апреля" }
                "5" -> date = "$day мая"
                "6" -> if ( d < 31 ) {date = "$day июня"}
                "7" -> date = "$day июля"
                "8" -> date = "$day августа"
                "9" -> if ( d < 31 ) {date = "$day сентября"}
                "10" -> date = "$day октября"
                "11" -> if ( d < 31 ) {date = "$day ноября"}
                "12" -> date = "$day декабря"
            }
        }
        if (date == "Такого дня не существует") { return (date)}
        var calendar: Calendar = GregorianCalendar(y, m - 1, d)
        when (calendar.get(Calendar.DAY_OF_WEEK) - 1) {
            1 -> return ("$date, понедельник")
            2 -> return ("$date, вторник")
            3 -> return ("$date, среда")
            4 -> return ("$date, четверг")
            5 -> return ("$date, пятница")
            6 -> return ("$date, суббота")
            0 -> return ("$date, воскресенье")
        }
        return (date)
    }
}
